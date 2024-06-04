package scanner;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("이름 알려줘 ㅠ : ");
//        String name = scanner.nextLine();
//        System.out.print("나이 알려줘 ㅠ : ");
//        int age = scanner.nextInt();
//
//        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");

//        System.out.print("정수 입력;;;");
//        int num = scanner.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("짝");
//        } else {
//            System.out.println("홀");
//        }

//        System.out.print("음식 이름 : ");
//        String foodName = scanner.nextLine();
//        System.out.print("음식 가격 : ");
//        int foodPrice = scanner.nextInt();
//        System.out.print("음식 갯수 : ");
//        int foodQuantity = scanner.nextInt();
//
//        int totalPrice = foodPrice * foodQuantity;
//        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

//        System.out.print("구구 : ");
//        int goo = scanner.nextInt();
//        System.out.println(goo + "단의 구구단 : ");
//        for (int i = 1; i <= 9; i++){
//            System.out.println(goo + " x " + i + " = " + goo*i);
//        }

//        int a = 10;
//        int b = 20;
//        int temp;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        System.out.print("num1 = ");
//        int num1 = scanner.nextInt();
//        System.out.print("num2 = ");
//        int num2 = scanner.nextInt();
//
//        if (num1 > num2) {
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//
//        System.out.print("두 숫자 사이의 모든 정수 :");
//        for (;num1 <= num2 ; num1++){
//            System.out.print(num1);
//            if (num1 != num2) {
//                System.out.print(", ");
//            }
//        }

//        while (true) {
//            System.out.print("이름 내놔 : ");
//            String name = scanner.nextLine();
//            if (name.equals("종료")) {
//                System.out.println("프로그램 종료");
//                break;
//            } else {
//                System.out.print("나이 내놔 : ");
//                int age = scanner.nextInt();  // age    \n 주의
//                scanner.nextLine(); // \n 읽고 버리기
//                System.out.println("이름은 " + name + ", 나이는 " + age);
//            }
//
//        }

        while (true) {
            System.out.print("가격 입력 : ");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("종룔ㄹㄹㄹㄹㄹ");
                break;
            }
            System.out.print("수량 입력 : ");
            int quantity = scanner.nextInt();
            int totalPrice = price * quantity;
            System.out.println("총 비용 : " + totalPrice);
        }

    }
}
