package afternoon.lang.immutable.ex;

public class ImmutableDateMain {
    public static void main(String[] args) {
        ImmutableDate immutableDate1 = new ImmutableDate(2024, 7, 1);
        ImmutableDate immutableDate2 = immutableDate1;

        System.out.println("Immutabledate2의 년도만 2025년으로 변경");
        immutableDate2 = immutableDate2.setYear(2025);

        System.out.println("date1 = " + immutableDate1);
        System.out.println("date2 = " + immutableDate2);
    }
}
