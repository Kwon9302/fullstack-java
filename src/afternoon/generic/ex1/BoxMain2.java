package afternoon.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setObj(10);
        Integer integer = (Integer) integerBox.getObj();
        System.out.println(integer);

        integerBox.setObj("100"); //실수한 부분, 숫자에 문자열 대입
        Integer integer2 = (Integer) integerBox.getObj();
        System.out.println(integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setObj("hello");
        String string = (String) stringBox.getObj();
        System.out.println(string);
    }
}
