package afternoon.extendss.access.child;

import afternoon.extendss.access.parents.Parent;

public class Child extends Parent {
    public void access(){
        System.out.println("publicValue : " + publicValue); // 어디서든 접근 가능
        System.out.println("protectedValue : " + protectedValue); //패키지는 다르지만 상속
        System.out.println("defaultValue :"); //패키지가 달라서 불가
        System.out.println("privateValue :"); //같은 클래스가 아니라 불가

        publicMethod();
        protectedMethod();
    }

}
