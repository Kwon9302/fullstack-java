package afternoon.extendss;

public class HydrogenCar extends Car {
    @Override
    public void  move() {
        System.out.println("수소차가 움직입니다.");
    }

    @Override
    public void openDoor() {
        System.out.println("수소차가 문을 엽니다!");
    }
    public void fillHydrogen(){
        System.out.println("수소를 충전 삘릴바라라ㅣㄹ보");
    }

}
