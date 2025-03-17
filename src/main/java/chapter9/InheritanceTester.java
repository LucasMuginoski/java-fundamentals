package chapter9;

public class InheritanceTester {
    public static void main(String[] args){
        Employee employee = new Employee();
        System.out.println();
        Mother mom = new Mother();
        mom.setName("Anna");
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
