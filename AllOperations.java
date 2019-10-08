import java.util.*;
import java.lang.Math; 
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner y = new Scanner(System.in);
	    Scanner x = new Scanner(System.in);
System.out.print("Enter First Number : ");
double a = y.nextDouble();
System.out.print("Enter Second Number : ");
double b = y.nextDouble();
System.out.print("Enter Operation : ");
String c = x.nextLine();
if ( c.equals("+"))
{
System.out.println(a+b);
}
	    else if (c.equals("-")){
	        System.out.println(a-b);
	    }
	    else if (c.equals("/")){
	        System.out.println(a/b);
	    }
	    else if (c.equals("*")){
	        System.out.println(a*b);
	    }
	    else if (c.equals("^")){
	        System.out.println(Math.pow(a,b));
	    }
	    else{
	        System.out.print("Not Valid Operation");
	    }
	}
}
