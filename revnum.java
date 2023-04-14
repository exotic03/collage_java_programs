import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        System.out.println("Enter the number : ");
        n=sc.nextInt();
        while(n!=0)
        {
          int d=n%10;
          rev=rev*10+d;
          n=n/10;
        }
        System.out.println("The reverse number is : "+rev);
    }
}
