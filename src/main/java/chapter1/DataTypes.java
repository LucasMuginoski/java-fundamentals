package chapter1;


public class DataTypes {
    public static void main(String arg[]){
        String description = "Description";
        System.out.println(description);

        float floatNumber = 3.14f; //We need to add the f in the end because by default Java treats decimal as double;
        long cpf = 18088240085L;
        System.out.println(cpf);
        Character character = 'A'; //We need to use sinlge quotes for Character data type

        System.out.println(floatNumber);
        System.out.println(character);

        Boolean bool = true;
        bool = false;
        System.out.println(bool);

        Integer numberOfBitcoins = 21;
        numberOfBitcoins = null;
        System.out.println(numberOfBitcoins);



    }
}
