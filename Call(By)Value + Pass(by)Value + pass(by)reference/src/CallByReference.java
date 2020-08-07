
public class CallByReference {
	static int x=1, y=2,s;
	public void Sum()
	{
	System.out.println("Original Values" + x+"\t"+y);
	s = x+y;
	System.out.println("Original Sum = " + s);
	CallByReference CBR = new CallByReference();
	Test(CBR);
	System.out.println("Value after call:  " + x +"\t"+y);
	s = x+y;
	System.out.println("Sum after call = " + s);
	}

	public void Test(CallByReference CBR)
	{
	CBR.x=111;
	CBR.y=111;
	int p = x*y;
	System.out.println("x*y =" + p);
	}
	
}
