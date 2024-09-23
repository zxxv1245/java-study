package study;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int test = 1; test <= T; test++){
            int N = scanner.nextInt();
            int[] arr = new int[10];
            String str = Integer.toString(N);
            for (int i = 0; i < str.length(); i++){
                char a = str.charAt(i);
                int n = a - '0';
//               어렵다... 아직 못풀...
            }
        }
    }
}
