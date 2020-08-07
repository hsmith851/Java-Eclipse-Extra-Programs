
public class CallByValue 
{	
public static void main(String [] args)
{
	int a = 200;
	System.out.println("Value before call : " + a);
	Test(a);
	System.out.println("Value after call : " + a);
}
public static void Test(int m)
{
	System.out.println("Value at the start : " + m);
	m = 600;
	System.out.println("Value at the end : " + m);	
}
}
