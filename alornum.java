import java.util.Scanner;

public class alornum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter a character : ");
        c=sc.next().charAt(0);
        if ((c>='A'&&c<='Z') || (c>='a'&&c<='z'))
        {
            System.out.println("This is a alphabet");
        }
        else
            System.out.println("This is not a alphabet");
    }
}
