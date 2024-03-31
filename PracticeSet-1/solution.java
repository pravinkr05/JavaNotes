2. 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Percentage Calculator");
		int s1,s2,s3,s4,s5;
		Scanner sc = new Scanner(System.in);
		
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();
		
		int total_sum  = (s1+s2+s3+s4+s5);
		int percentage = (total_sum*100)/500;
		
		System.out.println("The percentage of the marks boy received: "+ percentage);
	}
}

3.
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.next();
		System.out.println("Hello "+name+", have a good day");
	}
}

4.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int km;
		Scanner sc = new Scanner(System.in);
		km = sc.nextInt();
		double miles = km*1.609; // by default java consider double instead float
		
		//for float
		float mile = 1.24f; //it handle upto 7 decimal value
		System.out.println(km+"km = "+miles+"mile");
	}
}

5.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		
		boolean isInt = sc.hasNextInt(); //this function checks input data is integer or not;
		if(isInt)
	{	System.out.println("It is valid integer");}
		else 
{		System.out.println("It is not valid integer");}
	}
}

  
