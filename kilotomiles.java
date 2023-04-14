import java.util.Scanner;

public class kilotomiles {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        int kilo=sc.nextInt();
        System.out.println("The distance in miles:"+(kilo*0.621));
    }
}
