package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 숫자 :");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자 내놔 : ");
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("입력 그만 받을래 ㅠ");
                break;
            }
            int sum = a + b;
            System.out.println("합 = " + sum);
        }
    }
}
