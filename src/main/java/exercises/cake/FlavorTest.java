package exercises.cake;

public class FlavorTest {
    public static void main(String[] args){
        Cake cake1 = new Cake("chocolate");
        cake1.setPrice(29.99);
        System.out.println("Cake flavor: " + cake1.getFlavor());
        System.out.println("Cake price: " + cake1.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake("Vanilla");
        birthdayCake.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());

    }
}
