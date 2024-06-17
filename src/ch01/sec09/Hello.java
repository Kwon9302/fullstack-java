package ch01.sec09;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
