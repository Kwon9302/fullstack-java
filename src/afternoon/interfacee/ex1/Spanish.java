package afternoon.interfacee.ex1;

public class Spanish implements Human {
    @Override
    public void speak() {
        System.out.println("Hola");
    }

    @Override
    public void eat(){
        System.out.println("hola 머거여");
    }

    @Override
    public void hello(){
        System.out.println("hola hola "+year+"hola");
    }
}
