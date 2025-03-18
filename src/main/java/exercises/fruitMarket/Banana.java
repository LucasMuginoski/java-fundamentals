package exercises.fruitMarket;

public class Banana extends Fruit{
    public Banana() {
        setCalories(150);
    }
    public void peel(){
        System.out.println("Banana has been peeled.");
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made.");
    }
}
