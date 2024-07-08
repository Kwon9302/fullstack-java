package afternoon.generic.method;

public class GenericMehtodMain {
    public static void main(String[] args) {
        Integer integer = GenericMehtod.<Integer>genericMethod(10);

        Integer integer2 = GenericMehtod.<Integer>genericMethod(10);
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }
}
