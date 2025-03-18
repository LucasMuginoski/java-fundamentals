package chapter10;

public class Zoo {
    public static void main(String[] args){
        Dog rockie = new Dog();
        rockie.fetch();
        rockie.makeSound();
        feedAnimal(rockie);

        System.out.println();
        //sasha is an animal BUT is polimorphed into a dog.
        Animal sasha = new Dog();
        sasha.makeSound();
        //changed into a cat.
        sasha = new Cat();
        sasha.makeSound();
        //cast into a cat. Still an animal but now has access to cat methods in this specific line
        ((Cat) sasha).scratch();
        feedAnimal(sasha);
    }
    public static void feedAnimal(Animal animal){
        // instanceof operator is used to determine if an object is an instance of a certain class.
        if (animal instanceof Dog){
            System.out.println("Here is your dog food.");
        }
        else if (animal instanceof Cat){
            System.out.println("Here is you cat food.");
        }
    }
}
