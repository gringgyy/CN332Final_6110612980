public class DoubleBed extends Room{
    private int num = 10;
    private static DoubleBed instance;

    public DoubleBed(){}

    public static DoubleBed getInstance(){
        return instance;
    }

    public int getAvaliable() {
        return num;
    }
    public void setAvaliable(int numVal) {
        num = num - numVal;
    }
}