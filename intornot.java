import java.util.Scanner;

public class intornot {
    public static void main(String[]args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()) {
            System.out.println(sc.nextInt()+"is a integer");
        }
        else
        {
            System.out.println(sc.nextInt()+"is not a integer");
        }

    }
}
