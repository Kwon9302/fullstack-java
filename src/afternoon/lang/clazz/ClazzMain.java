package afternoon.lang.clazz;

import java.lang.reflect.Field;

public class ClazzMain {
    public static void main(String[] args) throws Exception {
        Class clazz1 = User.class; //클래스에서 직접 조회
        Class clazz2 = new User("dhgus").getClass();
        Class clazz3 = Class.forName("afternoon.lang.clazz.User");

        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field);
        }
        //상위 클래스 출력
        System.out.println("상위 클래스 = " + clazz1.getSuperclass());

        //상위 인터페이스 정보 출력
        Class[] interfaces = clazz1.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("상위 Interface: " + i);
        }

        User user = (User) clazz1.getDeclaredConstructor().newInstance();
        System.out.println("user" + user);
    }
}
