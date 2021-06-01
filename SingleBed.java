public class SingleBed extends Room{
    private int num = 20;

    public int getAvaliable() {
        return num;
    }
    public void setAvaliable(int numVal) {
        num = num - numVal;
    }
}