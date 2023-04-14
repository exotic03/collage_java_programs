import java.util.Scanner;

public class calculatePercentage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of first subject :");
        int a=sc.nextInt();
        System.out.println("Enter the marks of second subject :");
        int b=sc.nextInt();
        System.out.println("Enter the marks of third subject :");
        int c=sc.nextInt();
        System.out.println("Enter the marks of fourth subject :");
        int d=sc.nextInt();
        System.out.println("Enter the marks of fifth subject :");
        int e=sc.nextInt();
        System.out.println("The percentage of the student is "+(a+b+c+d+e)*100/500f);
    }
}
