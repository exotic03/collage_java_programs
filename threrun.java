class ab implements Runnable{
    public void run()
    {
        for(int i=0;i<5;i++) {
            System.out.println("Hue Hue");
        }
    }
}

public class threrun {
    public static void main(String[] args) {
        ab a=new ab();
        Thread t=new Thread(a);
        t.start();
        System.out.println("hh");
    }
}
