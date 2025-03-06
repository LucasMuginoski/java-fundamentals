package chapter7;

import java.util.ArrayList;

public class ArrayListsPossibility {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("Grapes");
        fruits.add(null);
        System.out.println(fruits);

        fruits.remove(null);
        System.out.println(fruits);
        //add into first position and all the rest is moved.
        fruits.add(0, "Pineapple");
        Integer size = fruits.size();
        System.out.println(fruits);
        System.out.println("Size of the list: "+ size);
        Boolean empty = fruits.isEmpty();
        System.out.println(empty);

        fruits.clear();
        System.out.println(fruits);
    }
}
