package afternoon.scanner1;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("종료 정수를 입력하세요 : ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("시작 정수 종료 정수 보다 큽니다!");
            return;
        }

        int sum=0;
        while(a<=b){
            sum+=a;
            a++;
        }
        System.out.println("시작 수 부터 종료 수 까지의 합은 :"+ sum);
    }
}
