import java.io.*;
public class Exception_Handling {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

		int Grade;
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(ISR);
		System.out.println("Enter your Grade : ");
		
	try {
		Grade = Integer.parseInt(BR.readLine());
		System.out.println("You are in class " + Grade);
	}
	catch(Exception ex) {
		System.out.println("Please enter your grade in numerical value");
	}
	finally
	{
		System.out.println("End of the program");
	}

}
}
