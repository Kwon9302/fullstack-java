package afternoon.generic.method;

public class GenericMehtod {
    public static <T> T genericMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }
}
