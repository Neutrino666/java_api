package part_5.limited_types;

//public class GenericClass<T extends Mammals>{
public class GenericClass<T extends Mammals & UprightPosture>{

    T animal;

    public GenericClass(T animal) {
        this.animal = animal;
    }

    public  void  animalSound() {
        animal.makeSound();
    }

    public void run() {
        animal.run();
    }
}
