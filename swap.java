import java.util.Scanner;

public class swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string :");
        String s1=sc.nextLine();
        System.out.println("Enter second string :");
        String s2=sc.nextLine();
        System.out.println("Before swapping :");
        System.out.print(s1);
        System.out.println(s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("After swapping :");
        System.out.print(s1);
        System.out.print(s2);
    }
}
