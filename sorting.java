import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,temp,n;
        int []a=new int[100];
        System.out.println("Enter the number of elements : ");
        n= sc.nextInt();
        System.out.println("Enter the elements : ");
        for (i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Elements before swapping : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for (i=0;i<n-1;i++)
        {
            for (j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Elements after swapping : ");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
