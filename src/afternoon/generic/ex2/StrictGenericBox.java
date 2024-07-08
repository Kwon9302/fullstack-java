package afternoon.generic.ex2;

public class StrictGenericBox<T>{
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        if(type instanceof String || type instanceof Integer || type instanceof Long) {
            this.type = type;
            System.out.println("타입이 맞습니다 저장합니다");
        } else {
            System.out.println("타입이 아닙니다.");
        }
    }
}
