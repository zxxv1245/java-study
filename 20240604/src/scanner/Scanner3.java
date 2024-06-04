package scanner;

import java.util.Scanner;


public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 숫자 : ");
        int a = scanner.nextInt();
        System.out.println("둘 숫자 : ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a = " + a);
        } else if (a < b) {
            System.out.println("b = " + b);
        } else {
            System.out.println("같다");
        }
    }
}
