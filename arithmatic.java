import java.util.Scanner;

public class arithmatic {
    public static void main(String[]arg){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number:");
       int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        System.out.println("The addition of three numbers are "+(a+b+c));
        System.out.println("The subtraction of three numbers are "+(a-b-c));
        System.out.println("The multiplication of three numbers are "+(a*b*c));
        System.out.println("The division of three numbers are "+(a/b/c));


    }
}
