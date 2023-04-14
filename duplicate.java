import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        int []a=new int[100];
        System.out.println("Enter the number of elements : ");
        n=sc.nextInt();
        System.out.println("Enter the elements : ");
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements are : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (a[i]==a[j])
                {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
