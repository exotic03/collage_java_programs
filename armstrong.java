import java.util.Scanner;

public class armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,rem,sum=0,temp;
        System.out.println("Enter a number :");
        n=sc.nextInt();
        temp=n;
        while (n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("This is a armstrong number");
        }
        else
        {
         System.out.println("This is not a armstrong number");
        }

    }
}
