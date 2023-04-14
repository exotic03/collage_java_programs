class cylinder{
    int radius;
    int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int n){
        this.radius=n;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int m) {
        this.height = m;
    }
}
public class cylin {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setRadius(4);
        c.setHeight(5);
        System.out.println("The Radius is :"+c.getRadius());
        System.out.println("The height is :"+c.getHeight());
        int s,v;
        s=c.getRadius();
        v=c.getHeight();
        System.out.println("The surface is :"+2*Math.PI*s*s*v);
        System.out.println("The volume is :"+2*Math.PI*s*v);

    }
}

