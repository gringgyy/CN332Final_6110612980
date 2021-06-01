public class DoubleBed extends Room{
    private int num = 10;

    public int getAvaliable() {
        return num;
    }
    public void setAvaliable(int numVal) {
        num = num - numVal;
    }
}