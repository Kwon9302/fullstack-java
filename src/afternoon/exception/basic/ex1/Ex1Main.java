package afternoon.exception.basic.ex1;

public class Ex1Main {
    static class Parent{};

    static class Child extends Parent {
        void childMethod(){
            System.out.println("Child.childMethod");
        }
    };
    public static void main(String[] args) {
        Parent parent = new Parent();
        try {
            Child poly = (Child) parent;
            poly.childMethod();

        } catch (ClassCastException e){
            System.out.println("예외처리 완료");
            e.printStackTrace();
        }
    }
            }








