import java.util.Scanner;

public class multiplication {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();
        System.out.println("enter b:");
        int b= sc.nextInt();
        System.out.println("enter c:");
        int c= sc.nextInt();
        int sum=(a*b*c);
        System.out.println("sum:"+sum);
    }
}
