package afternoon.nested.inner.ex3;

public class OuterClassMain2 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.new InnerClass().hello();
    }
}
