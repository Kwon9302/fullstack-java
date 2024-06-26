package afternoon.abstractt;

public class Cat extends AbstractAnimal {

    @Override
    public void sound(){
        System.out.println("고양이도 멍멍");

    }

    @Override
    public void eat(){
        System.out.println("고양이가 밥을 먹습니다.");
    }
}
