
import java.util.Scanner;

public class vowelandconsonent {
    public static void main(String[]args){
        int vCount=0,cCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
         str=str.toLowerCase();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            } else if (ch>='a'&&ch<='z') {
                cCount++;

            }
        }
        System.out.println("Number of vowels:"+vCount);
        System.out.println("Number of consonants:"+cCount);
    }
}
