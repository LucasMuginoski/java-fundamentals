package chapter1;

public class Strings {
    public static void main(String[] args){
        String name = "Peachez Programmimg";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.contains("Programmimg"));
        System.out.println(name.charAt(1));
        System.out.println(name.substring(8, name.length()));
        String firstName = "Peachez";
        String lastName = "Programmimg";
        System.out.println(firstName.concat(" ").concat(lastName));
        //Here it apoints to nothing, "no string".
        String nullString = null;
        //Here we have a string with nothing on it.
        String emptyString = "";
        String username = "";
        //Here the return should be true (since username string is empty).
        System.out.println(username.isEmpty());
        //Cannot invoke "String.isEmpty()" because "username" is null

    }
}
