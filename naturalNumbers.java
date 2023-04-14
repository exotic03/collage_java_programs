import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        naturalNumbers nn=new naturalNumbers();
        System.out.print("The first n natural number is : ");
        nn.natural(n,1);

    }
    int  natural(int y,int i)
    {
       if(i<=y)
       {
           System.out.print(i+" ");
           return (natural(y,++i));
       }
       return 1;
    }
}
