import java.util.Scanner;

public class palindrom {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0,temp,rem;
        System.out.println("Enter a number :");
        n=sc.nextInt();
        temp=n;
        while(n>0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n/10;
        }
            if (temp==sum)
            {
                System.out.println("This is a palindrome");
            }
            else
            {
                System.out.println("This is not a palindrome number");
            }

    }
}
