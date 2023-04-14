import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[]args){
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want to store :");
        n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements of array :");
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is :"+ Arrays.toString(arr));
        temp=arr[n-1];
        for (int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("After rotation :"+Arrays.toString(arr));
    }
}
