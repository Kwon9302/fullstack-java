package afternoon.extendss;

public class GasCar extends Car {
    @Override
    public void  move() {
        System.out.println("기름차가 움직입니다.");
    }

    @Override
    public void openDoor() {
        System.out.println("기름차가 문을 엽니다!");
    }

    public void fillUp() {
        System.out.println("기름차가 주유합니다.");
    }

}
