package chapter1;

public class IntegersAndDoubles {
    public static void main(String[] args){
        /* user for whole number.
        * can be null and no concept of "Empty integer"
        * have a bunch of built-in methods.
         */
        String numberOfLikes = "11";
        Integer numOfLikes = 10;
        System.out.println(numOfLikes);
        System.out.println(numOfLikes.doubleValue());
        System.out.println(Integer.parseInt(numberOfLikes));
        Integer num1 = 2;
        Integer num2 = 3;
        System.out.println("This is the result of addition: " + (num1 + num2));

        //Doubles are very similar of Integers but Integers are 'contained' in doubles
        System.out.println("Now we're working with doubles");
        double pi = 3.14159265359;
        System.out.println(pi);
        Integer x = 123456;
        System.out.println("x as integer: " + x + ", x as float: " + x.floatValue());

        double sum = pi + x.floatValue();
        System.out.println(sum);
        double division = sum / 2;
        System.out.println(division);
        double value = 40;
        System.out.println("Value of Double is: " + value);

        String containsDecimal = "10.15";
        double decimal = Double.parseDouble(containsDecimal);
        System.out.println(decimal);


    }
}
