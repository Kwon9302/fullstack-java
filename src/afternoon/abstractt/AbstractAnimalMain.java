package afternoon.abstractt;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animal = new AbstractAnimal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Duck();

        for(AbstractAnimal a : animal) {
            animalCall(a);
        }
    }

    static void animalCall(AbstractAnimal animal) {
        animal.eat();
        animal.sound();

        if (animal instanceof Duck) {
            ((Duck) animal).fly();
        }
    }
}
