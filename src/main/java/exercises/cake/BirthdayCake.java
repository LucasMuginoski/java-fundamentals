package exercises.cake;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(String flavor) {
        super("Vanilla");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
