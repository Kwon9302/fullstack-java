package afternoon.scanner1;

import java.util.Scanner;

public class Scanner3Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int b = scanner.nextInt();


        System.out.println("두 수의 차는 : " + (a-b));
        System.out.println("두 수의 곱은 : " + (a*b) );
    }
}
