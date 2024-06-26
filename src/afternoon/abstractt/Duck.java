package afternoon.abstractt;

public class Duck extends AbstractAnimal {

    @Override
    public void sound(){
        System.out.println("오리도 멍멍");
    }

    @Override
    public void eat(){
        System.out.println("오리가 밥을 먹습니다.");
    }
    public void fly(){
        System.out.println("오리날다");
    }
}
