import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        double n=sc.nextInt();
        if (n<0.0)
        {
            System.out.println("This is a negative number");
        }
        else if (n>0.0)
        {
            System.out.println("This is a positive number");
        }
        else
            System.out.println("number is 0");
    }
}
