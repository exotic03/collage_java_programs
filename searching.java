import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,val;
        int []a=new int[100];
        System.out.println("Enter the number of elements : ");
        n=sc.nextInt();
        System.out.println("The elements are : ");
        for (i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search : ");
        val=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(val==a[i])
            {
                System.out.println("Element "+val+" found at index "+i);
                break;
            }
        }
        if(i==n)
        {
            System.out.println("not found");
        }
    }
}
