package afternoon.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(rand.nextInt());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextBoolean());

        System.out.println(rand.nextInt(100)); // 0~ 99

    }
}
