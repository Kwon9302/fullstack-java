package afternoon.polyfinal;

public class NaverPay implements Pay {
    @Override
    public void pay(int amount) {
        System.out.println("Naver pay 시스템과 연결함니다");
        System.out.println(amount + " 결제시도");
        System.out.println("결제 성공");
    }
}
