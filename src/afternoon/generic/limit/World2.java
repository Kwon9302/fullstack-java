package afternoon.generic.limit;

public class World2 {
    public static void main(String[] args) {
        GenericWorld<Integer> integerWorld = new GenericWorld<>();
        integerWorld.setType(10);
        integerWorld.transDouble();
        System.out.println("integerWorld = " + integerWorld.getType());

        GenericWorld<Long> longWorld = new GenericWorld<>();
        longWorld.setType(20L);
        System.out.println("longWorld = " + longWorld.getType() );
    }
}
