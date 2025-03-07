package chapter8;

public class firstCaptalized {
    public static void main(String[] args) {
        String name = "Lucas";
        System.out.println(name.charAt(0));
        System.out.println(startWithUpperCase(name));
    }
    public static String startWithUpperCase(String string){
        if (Character.isUpperCase(string.charAt(0))){
            return "Is a capital letter";
        }
        else{
            return "Isn't a capital letter";
        }
    }
}
