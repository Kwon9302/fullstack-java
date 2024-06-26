package afternoon.interfacee.ex1;

public class Korean implements Human {
    @Override
    public void speak() {
        System.out.println("Korean");
    }

    @Override
    public void eat(){
        System.out.println("김치머거여");
    }

    @Override
    public void hello(){
        System.out.println("ㅎㅇ 지금은 "+year+"년 입니당");
    }
}
