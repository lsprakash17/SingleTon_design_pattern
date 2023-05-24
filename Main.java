package SingleTonDesinPattern;

public class Main 
{
public static void main(String[] args) 
{
Sample s=Sample.getSample();
System.out.println(s.a);
 s.setSample(20);
 System.out.println(s.a);
}
}
