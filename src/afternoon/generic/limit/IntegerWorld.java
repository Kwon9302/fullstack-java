package afternoon.generic.limit;

public class IntegerWorld {
    private Integer number;

    @Override
    public String toString() {
        return "IntegerWorld{" +
                "number=" + number +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double transDouble(){
        return number.doubleValue();
    }
}
