package afternoon.poly3.instance;

public class InstanceMain2 {
    public static void main(String[] args) {
        Parent[] parents = {new Parent(), new Child(), new GrandChild()};

        for (Parent p : parents) {
            testInstanceOf(p);

        }
    }

    private static void testInstanceOf(Parent p) {
        if (p instanceof Child) {
            System.out.println("매개 변수로 들어오느 인스턴스가 Child클래스 인스턴스가 맞음");
            ((Child) p).childMethod();
        }
        if (p instanceof GrandChild) {
            System.out.println("매개 변수로 들어오느 인스턴스가 GrandChild 클래스 인스턴스가 맞음");
            ((GrandChild) p).grandChildMethod();
        }

    }
}
