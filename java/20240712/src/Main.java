import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i >= 1; i--){
            for (int x = 1; x < i; x++){
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++){
            for (int x = 1; x < i; x++){
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}