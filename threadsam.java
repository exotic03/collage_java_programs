class sample extends Thread{
    public void run()
    {
        try {
            for(int i=0;i<5;i++)
            {
                System.out.println("This is a football");
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException i)
        {

        }
    }
}
public class threadsam {
    public static void main(String[] args) throws InterruptedException{
        sample sam=new sample();
        for(int i=1;i<=5;i++)
        {
            System.out.println("This is a cricket");
            Thread.sleep(2000);
        }
        sam.start();
    }
}
