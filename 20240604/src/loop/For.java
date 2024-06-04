package loop;

public class For {
    public static void main(String[] args) {

//        for(int i = 1; i <=5; i++){
//            System.out.println(i);
//        }
//
//        int sum = 0;
//        int end = 10;
//
//        for(int i = 1; i <= end; i++){
//            sum += i;
//            System.out.println("for sum = " + sum);
//        }
//
//        int i = 1;
//        sum = 0;
//
//        while (i <= end) {
//            sum += i;
//            i ++;
//            System.out.println("while sum = " + sum);
//        }

        // for break

//        int sum = 0;
//        int i = 1;

//        for (;;) {
//            sum += i;
//            if (sum > 10) {
//                System.out.println("합 10이면 종료 i = " + i + " sum = " + sum);
//                break;
//            }
//            i ++;
//        }

        int sum = 0;



        for (int i = 1 ; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("d합 10이면 종료 i = " + i + " sum = " + sum);
                break;
            }

        }

    }
}
