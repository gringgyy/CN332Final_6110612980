public class SingleBed extends Room{
    private int num = 20;
    private static SingleBed instance;
    public SingleBed(){}

    public static SingleBed getInstance(){
        return instance;
    }

    public int getAvaliable() {
        return num;
    }

    public void setAvaliable(int numVal) {
        num = num - numVal;
    }
}