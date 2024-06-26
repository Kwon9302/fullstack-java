package afternoon.interfacee.ex1;

public class American implements Human {
    @Override
    public void speak() {
        System.out.println("American");
    }

    @Override
    public void eat(){
        System.out.println("햄버거 머거여");
    }

    @Override
    public void hello(){
        System.out.println("hello now "+year);
    }
}
