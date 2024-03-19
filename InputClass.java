import java.util.Scanner;

public class InputClass {
     public static void main(String[] args) {
        //Add Three Numbers
        // int a=1;
        // int b=4;
        // int c=5;

        //Taking Input From User
        Scanner S = new Scanner(System.in);

        // data is int
        int a = S.nextInt();
        int b= S.nextInt();
        int c = S.nextInt();

        //input is string Such as articles
        String str = S.nextLine();
        //input is string - word
        String st = S.next();
        //input is character 
        char ch = S.next().charAt(0);

        int sum = a+b+c;
        
        System.out.println("Sum of three numbers a,b,c is " + sum);
        System.out.println("String 1 : "+str+" 2:"+st+" 3."+ch);

    }
}
