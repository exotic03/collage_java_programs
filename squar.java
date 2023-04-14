class squaree{
    int length;
    int breath;
    squaree(int l)
    {
        length=l;
    }
    squaree(int l,int b)
    {
        length=l;
        breath=b;
    }
    void display()
    {
        System.out.println("The length is : "+length);
        System.out.println("The breath is : "+breath);
    }
}
public class squar {
    public static void main(String[] args) {
        squaree s=new squaree(5,6);
        s.display();
    }
}
