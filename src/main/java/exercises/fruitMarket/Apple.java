package exercises.fruitMarket;

public class Apple extends Fruit{

    public Apple(){
        setCalories(15);
    }

    public void removeSeeds(){
        System.out.println("Seeds removed.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made.");
    }
}
