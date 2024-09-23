import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            } else {
                if (n % 2 == 0) {
                    arr[i] = n;
                    cnt++;
                }
            }
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(cnt + " " + sum);
    }
}