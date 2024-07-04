package afternoon.codeSendPr;

import java.util.Random;
import java.util.Scanner;

public class Ex5Main {
    public static void complicateProgram(Fortune fortune) {
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        fortune.run();


        System.out.println("복잡한 과정 다시 시작");
        System.out.println("복잡한 과정 종료 후, 프로그램 종료");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fortune fortuneDay = new Fortune() {
            @Override
            public void run() {
//                System.out.println("*** 오늘은 행운의 날입니다. 행복하세요!");
                System.out.println("오늘의 행운의 번호를 입력하세요");
                int num = scanner.nextInt();
                for (int i = 0; i < 3; i++) {
                    int rand = new Random().nextInt(99) + 1;
                    if (rand == num) {
                        System.out.println("와우!! 완전한 행운의 날입니다.");
                        return;
                    }
                }
                System.out.println("입력한 번호는 불운의 번호이니 오늘은 피하세여~");
            }
        };

        Fortune fortuneNumber = new Fortune() {
            @Override
            public void run() {
//                int rand = new Random().nextInt(99) + 1;
//                System.out.println("*** 오늘의 행운의 번호는 "+rand+"입니다.");
            }
        };


        complicateProgram(fortuneDay);
//        complicateProgram(fortuneNumber);
    }
}

