package afternoon.generic.limit;

public class GenericWorld<T extends Number> {
        private T number;

    public T getType() {
        return number;
    }

    public void setType(T number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "GenericWorld{" +
                "number=" + number +
                '}';
    }

    public double transDouble(){
        return number.doubleValue();
    }
}
