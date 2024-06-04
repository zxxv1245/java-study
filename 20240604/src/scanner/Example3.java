package scanner;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = 0;
        while (true) {
            int option = scanner.nextInt();
//            scanner.nextInt();
            if (option == 1) {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity =scanner.nextInt();

                int totalPrice = price * quantity;
                cost += totalPrice;

                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 :" + quantity + " 합계 : " + totalPrice);

            } else if (option == 2) {
                System.out.println("총 비용 : " + cost);
                cost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }
}
