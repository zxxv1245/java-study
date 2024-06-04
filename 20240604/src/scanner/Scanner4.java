package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("입력해주세용 :");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("종료지롱");
                break;
            }
            System.out.println("input = " + input);
        }
    }
}
