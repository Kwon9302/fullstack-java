package afternoon.scanner1;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();

        System.out.print("정수를 입력하세요 : ");
        int number2 = sc.nextInt();

        int sum = number + number2;
        System.out.println("두 수의 합은 :" + sum);
    }
}
