import java.util.Scanner;

public class calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ch,a,b,result=0;
        System.out.println("Enter the operand a :");
        a= sc.nextInt();
        System.out.println("Enter the operand b :");
        b= sc.nextInt();
        System.out.println("......Menu.......");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice :");
        ch= sc.nextInt();
        switch (ch)
        {
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                result=a/b;
                break;
            default:
                System.out.println("invalid input");
        }
        System.out.println("The result is :"+result);
        return;
    }
}
