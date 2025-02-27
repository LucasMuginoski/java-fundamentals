package chapter1;

public class Booleans {
    public static void main(String[] args){
        //used for true and false.
        String value = "TRUE";
        Boolean booleanValue = Boolean.parseBoolean(value);
        System.out.println(booleanValue);

        //Can user logic op. AND OR NOT
        System.out.println(!booleanValue);
    }
}
