package afternoon.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setValue(40);
        Integer integer = integerGenericBox.getValue();
        System.out.println(integer);


        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("Hello");
        String string = stringGenericBox.getValue();
        System.out.println(string);
    }
}
