import java.util.Scanner;

class calculateSquare{
    int side;
    int area(int x)
    {
        return(x*x);
    }
    int perimeter(int x)
    {
        return(4*x);
    }
}
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateSquare s = new calculateSquare();
        System.out.println("Enter the length of the side : ");
        int side = sc.nextInt();
        int area = s.area(side);
        int perimeter = s.perimeter(side);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
