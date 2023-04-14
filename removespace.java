import java.util.Scanner;

public class removespace {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str.replaceAll("\\s","");
        System.out.println("After removing all white spaces :"+str);
    }
}
