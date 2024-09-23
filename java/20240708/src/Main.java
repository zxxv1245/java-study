import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumV = 0;
        int cnt = 0;
        while (true) {
            int a = sc.nextInt();
            if (a / 10 != 2){
                break;
            }
            sumV += a;
            cnt += 1;
        }
        System.out.printf("%.2f",(double)sumV/cnt);
    }
}