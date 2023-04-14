import java.util.Scanner;

public class factorial {
    public static void main(String[]args){
        int n,rec;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        factorial f=new factorial();
        rec= f.fact(n);
        System.out.println("The factorial of number is "+rec);

    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }

}
