package afternoon.lang.wrapper;

public class WrapperMethodMain {
    public static void main(String[] args) {
        int intValue = Integer.parseInt("123");

        //비교
        Integer a= 10;
        System.out.println(a.compareTo(intValue));

        // 산술 연산
        System.out.println(Integer.sum(10,20));
        System.out.println(Integer.min(10,20));
        System.out.println(Integer.max(10,20));
    }
}
