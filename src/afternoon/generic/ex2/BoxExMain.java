package afternoon.generic.ex2;

public class BoxExMain {
    public static void main(String[] args) {
        StrictGenericBox<String> strictGenericBox = new StrictGenericBox<>();
        strictGenericBox.setType("hello");
        System.out.println("strictGenericBox = " + strictGenericBox.getType ());

        StrictGenericBox<Double> strictGenericBox2 = new StrictGenericBox<>();
        strictGenericBox2.setType(3.0);

    }
}
