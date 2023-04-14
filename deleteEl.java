import java.util.Scanner;

public class deleteEl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,pos;
        int []a=new int[100];
        System.out.println("Enter the number of elements : ");
        n=sc.nextInt();
        System.out.println("Enter the elements : ");
        for (i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("The elements are : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Enter the position to delete : ");
        pos= sc.nextInt();
        for (i=pos-1;i<=n-1;i++)
        {
            a[i]=a[i+1];
        }
        n--;
        System.out.println("After deletion : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
