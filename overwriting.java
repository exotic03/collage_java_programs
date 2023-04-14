class A{
    public void meth1(){
        System.out.println("I am a method of class a");
    }
}
class B extends A{
    public void meth1(){
        System.out.println(" i am a method class b");
    }
}
public class overwriting {
    public static void main(String[] args) {
        A ob=new A();
        ob.meth1();
        B m=new B();
        m.meth1();
    }
}
