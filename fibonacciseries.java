import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[]args){
        int n,rec;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        System.out.print("The fibonacci series is : ");
        for (int i=0;i<n;i++)
        {
            rec=fibo(n);
            System.out.print(" "+fibo(i));
        }

    }
    public static int fibo(int n){
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        else
            return fibo(n-2)+fibo(n-1);

    }
}
