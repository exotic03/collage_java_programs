import java.util.Scanner;

public class huhu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n,m,sum=0;
        System.out.println("Enter the number of subjects : ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println("Subject "+i);
            m=sc.nextInt();
            sum+=m;
        }
        double cgpa=sum/n;
        System.out.println("CGPA is : "+cgpa);

    }
}
