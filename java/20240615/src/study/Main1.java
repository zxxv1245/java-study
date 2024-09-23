package study;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ret = 0;


        for (int i = a; i<=b; i++){
            if (i % c == 1){
                ret += i;
            }
        }

        System.out.println(ret);
    }
}
