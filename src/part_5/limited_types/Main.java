package part_5.limited_types;

public class Main {

    public static void main(String[] args) {

//        GenericClass<Mammals> first = new GenericClass<>(new Mammals());
//        GenericClass<Cat> second = new GenericClass<>(new Cat());
//        GenericClass<Dog> third = new GenericClass<>(new Dog());
//        first.animalSound();
//        second.animalSound();
//        third.animalSound();

        GenericClass<Human> human = new GenericClass<>(new Human());
        human.animalSound();
        human.run();
    }
}
