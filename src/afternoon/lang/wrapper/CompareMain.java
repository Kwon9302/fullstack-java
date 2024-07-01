package afternoon.lang.immutable;

public class CompareMain {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = Integer.valueOf(1);

        Long long1 = Long.valueOf(100);
        Double double1 = Double.valueOf(11.18);

        System.out.println(integer1.intValue());
        System.out.println(integer2.intValue());
        System.out.println(long1.intValue());
        System.out.println(double1.intValue());
    }
}
