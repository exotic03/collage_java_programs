import java.util.Scanner;

public class primenumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        System.out.print("The prime numbers are :");
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                System.out.print("\t"+i);
            }
        }
        }
}
