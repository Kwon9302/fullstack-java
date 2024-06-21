package afternoon.extendss.poly2;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

//        donkey.sound();
//        dog.sound();
//        cat.sound();
//        chicken.sound();

        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chicken);

    }
    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
