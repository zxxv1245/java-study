package method;

import java.util.Scanner;

public class Ex2 {

    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 입금하였습니다. 현재 잔액 : " + balance);
            return balance;
        }
        System.out.println(money + "원을 츨금하려 했으나 잔액이 부족합니다.");
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택 : ");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int money = scanner.nextInt();
                balance = deposit(balance,money);
            } else if (input == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int money = scanner.nextInt();
                balance = withdraw(balance,money);
            } else if (input == 3) {
                System.out.println("현재 잔액 : " + balance);
            } else if ( input == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
