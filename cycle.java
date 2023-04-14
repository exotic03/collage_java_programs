interface bycycle{
    void applybrake(int dec);
    void speedup(int inc);
}
class herocycle implements bycycle{
    int speed=7;

    @Override
    public void applybrake(int dec) {
        System.out.println("Applying brake");
    }

    @Override
    public void speedup(int inc) {
        System.out.println("Applying speed up");
    }
}
public class cycle {
    public static void main(String[] args) {
        herocycle he=new herocycle();
        he.applybrake(1);
        System.out.println(he.speed);
        he.speedup(2);
    }
}
