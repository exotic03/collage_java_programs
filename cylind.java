class cylinderr{
    int radius;
    int height;
    cylinderr(int n,int m){
        radius=n;
        height=m;
    }

    void display(){
        System.out.println("The radius is : "+radius);
        System.out.println("The height is : "+height);
    }
}
public class cylind {
    public static void main(String[] args) {
        cylinderr c=new cylinderr(4,5);
        c.display();
        int s=c.radius;
        int v=c.height;
        System.out.println("The surface is :"+2*Math.PI*s*s*v);
        System.out.println("The volume is :"+2*Math.PI*s*v);
    }
}
