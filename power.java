import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int base,exponent,result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base : ");
        base=sc.nextInt();
        System.out.println("Enter the exponent : ");
        exponent=sc.nextInt();
        while(exponent!=0)
        {
            result=result*base;
            --exponent;
        }
        System.out.println("The power of number is : "+result);
    }
}
