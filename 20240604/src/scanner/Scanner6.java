package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("입력해줘ㅠ : ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("sum = " + sum);
                System.out.println("0이다,,, 종료할께,,,");
                break;
            }
            sum += num;
        }
    }
}
