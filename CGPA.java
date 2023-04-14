import java.util.Scanner;

public class CGPA {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of first subject:");
        int a=sc.nextInt();
        System.out.println("Enter the number of second subject:");
        int b=sc.nextInt();
        System.out.println("Enter the number of third subject:");
        int c=sc.nextInt();
        System.out.println("The CGPA of three subject is :"+(a+b+c)/3f);


    }
}
