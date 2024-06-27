package afternoon.poly4;

public class Duck implements Animal,Fly {
    @Override
    public void sound(){
        System.out.println("오리는 깍각");
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly(){
        System.out.println("오리날다");
    }
}
