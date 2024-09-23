package study;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lst = new int[10];
        for (int i = 0; i<10; i++){
            lst[i] = scanner.nextInt();
        }
        int ret = lst[2] + lst[4] + lst[9];
        System.out.println(ret);
    }
}
