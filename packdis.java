import java.util.Scanner;

class take{
    int n;
    void take(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
    }
}
class display extends take{
    void take() {
        super.take();
        System.out.println("The number is :"+n);
    }
}

public class packdis {
    public static void main(String[] args) {
        display dis=new display();
        dis.take();
    }
}
