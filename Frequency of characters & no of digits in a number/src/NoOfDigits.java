import java.io.*;
public class NoOfDigits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader BR = new BufferedReader(new InputStreamReader (System.in));	
System.out.print("Enter a number with decimal places : ");
double d = Double.parseDouble(BR.readLine());
String S = Double.toString(d);
int b = S.indexOf('.');
int a = (S.length()-1)-b; 
System.out.println(b + " digit(s) before the decimal point: ");
System.out.println(a + " digit(s) before the decimal point: ");




		
	}

}
