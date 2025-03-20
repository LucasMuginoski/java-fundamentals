package chapter11;

public class Costumer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setPrice(69.99);
        System.out.println(book.getPrice());
    }
}
