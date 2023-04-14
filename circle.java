import java.util.Scanner;

class calculateCircle{
    double area(int r)
    {
        return (Math.PI*r*r);
    }
    double perimeter(int r)
    {
        return(2*Math.PI*r);
    }
}
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateCircle c = new calculateCircle();
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        double area = c.area(radius);
        double perimeter = c.perimeter(radius);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
