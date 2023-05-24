package SingleTonDesinPattern;

public class Sample {

	static Sample s;
	int a = 10;
    static int count=0;
	private Sample() {
       count++;
	}
	public static Sample getSample() 
	{
		if(count<1)
		{
			s=new Sample();
		}
		return s;
	}

	public static void setSample(int a) {
		s.a = a;
	}

}
