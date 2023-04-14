import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number : ");
        num1=sc.nextInt();
        System.out.println("Enter the second number : ");
        num2=sc.nextInt();
        int temp;
        System.out.println("Before swapping :"+num1+" "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping :"+num1+" "+num2);
    }
}
