import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pos,n,m,i;
        int []a=new int[100];
        System.out.println("Enter the number of elements : ");
        n=sc.nextInt();
        System.out.println("The elements are : ");
        for (i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("elements : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Enter the value to insert : ");
        m=sc.nextInt();
        System.out.println("Enter the position : ");
        pos=sc.nextInt();
        for (i=n-1;i>=pos-1;i--)
        {
            a[i+1]=a[i];
        }
        a[pos-1]=m;
        n++;
        System.out.println("After insertion : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
