package JUnitTestPakage;
import java.util.*;
public class JUnitFunctions {


	public static int Addnumbers(int a ,int b) {
		int c = a + b ;
		return c ;
	}
	
	public static String AddString(String a , String b) {
		String  c = a.concat(b);
		return c ;
		
	}
	public static void main(String[] args) {
		int a = 8 ;
		int b = 5 ;
		System.out.println(Addnumbers(a,b));
		String c = "Hello";
		String d = "World";
		System.out.println(AddString(c,d));
	}

}