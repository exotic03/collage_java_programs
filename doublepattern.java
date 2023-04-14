import java.util.Scanner;

public class doublepattern {
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        row=sc.nextInt();
        for (int i= 0; i<= row-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i=row-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}
