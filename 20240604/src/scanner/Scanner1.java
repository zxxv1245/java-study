package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sadda\n");
        System.out.println("dsdas\n");


        System.out.println("문자열을 입력하세요 :");
        String str= scanner.nextLine();
        System.out.println("입력한 문자열:" + str);

        System.out.println("정수를 입력하세이");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);

        System.out.println("실수 입력하세이");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);
    }
}
