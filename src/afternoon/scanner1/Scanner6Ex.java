package afternoon.scanner1;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ranNum = (int) (Math.random()*100);

        while(true) {
            System.out.print("랜덤 숫자를 입력하세요 :");
            int input = scanner.nextInt();

            if (input < ranNum) {
                System.out.println("Up");
                continue;
            }
            if (input > ranNum) {
                System.out.println("Down");
                continue;
            }
            if (input == ranNum) {
                System.out.println("정답입니다! 랜덤 숫자는 " + input);
                return;
            }
        }
    }
}
