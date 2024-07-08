package afternoon.generic.limit;

public class LongWorld {
    private Long number;

    @Override
    public String toString() {
        return "LongWorld{" +
                "number=" + number +
                '}';
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public double transDouble(){
        return number.doubleValue();
    }
}
