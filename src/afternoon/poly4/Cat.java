package afternoon.poly4;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다.");
    }

    @Override
    public void sound(){
        System.out.println("고양이 양양");
    }
}
