/******************************************************************************
datatypes with operators

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		double a1 = 20+22/2*3-5;
		double b1 = 20+3*22/2-5; 
		
		//concept we have used precedence(which operators evaluating first compared to others) %,*,+,-
		
		//operands - a,b / operators - +
		
		//Associativity - just say the direction of exeecution when precedence of operators are same left to right or its opposite. ex- +,- L to right
		
		System.out.println(a1);
		System.out.println(b1);
		
		
		int b = 2;
        int c = 0;
        int a = 1;
        int k = (b*b - (4*a*c))/(2*a);
        int k2 = b*b - (4*a*c)/(2*a);
        System.out.println(k);
        System.out.println(k2); // getting different result on changing the execution order using paranthesis.
 
     
        // integer + char = integer
        // integer + float = float
        // float + double = double
        
// Quick Quiz: What will be the value of the following expression(x).

int y=7;
int x = ++y*8;
// value of x?
System.out.println(x);

char ch = 'B';
ch++; 
System.out.println(ch);


	}
}
