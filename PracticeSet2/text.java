/******************************************************************************
Chapter 2 - Practice Set (Java Practice Questions)

What will be the result of the following expression:
float a = 7/4 * 9/2

Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

Use comparison operators to find out whether a given number is greater than the user entered number or not.

Write the following expression in a java program:
(v^2-u^2)/2as

Find the value of 'a' in expression given below :
int x = 7
int a = 7*49/7 + 35/7

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
    	float a1 = 7/4f * 9/2f; // accurate float
    	float a2 = 7/4 * 9/2f;  // f part is float - 4.5
    	float a3 = 7/4 * 9/2;   // 4.0
    	System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
	}
}
