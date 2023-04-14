interface inter{
    void print();
}
class p implements inter{
    @Override
    public void print() {
        System.out.println("hello");
    }
}

public class interf {
    public static void main(String[] args) {
        inter i=new p();
        i.print();
    }
}
