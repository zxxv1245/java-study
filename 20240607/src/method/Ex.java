package method;

public class Ex {
//    public static void main(String[] args) {
//         add(1,2,3);
//         add(15,25,35);
//    }
//    public static void add(int a, int b, int c) {
//        int sum = a + b + c;
//        double avg = sum / 3.0;
//        System.out.println("평균 = " + avg);
//    }
    public static void main(String[] args) {
//        String message = "Hello Java";
//        HelloJava(message,3);
//        HelloJava(message,5);
//        HelloJava(message,7);

        int balance = 10000;
        balance = deposit(balance,1000);
        balance = withdraw(balance,3000);

    }
    public static void HelloJava(String message, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(message);
        }
    }

    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println("입금 완, 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int money) {
        balance -= money;
        System.out.println("출금 완, 현재 잔액 : " + balance);
        return balance;
    }
}
