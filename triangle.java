import java.util.Scanner;

class calculateTriangle{
    int side;
    int area(int x)
    {

        return(1/2*x*x);
    }
    int perimeter(int x)
    {
        return(x+x+x);
    }
}
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculateTriangle t=new calculateTriangle();
        System.out.println("Enter the length of side : ");
        int side=sc.nextInt();
        int area=t.area(side);
        int perimeter=t.perimeter(side);
        System.out.println("The area of triangle is "+area);
        System.out.println("The perimeter of triangle is "+perimeter);
    }
}
