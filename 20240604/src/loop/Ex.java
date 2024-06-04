package loop;

public class Ex {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i <= 10) {
//            System.out.println("while i = " + i);
//            i ++;
//        }
//
//        for(int ii = 1; ii <= 10; ii++) {
//            System.out.println("for ii = " + ii);
//        }

//        int num = 2;
//
//        while (num <= 20) {
//            System.out.println("while num = " + num);
//            num += 2;
//        }
//
//        for (num = 2; num <= 20; num += 2) {
//            System.out.println("for num = " + num);
//        }

//        int max = 100;
//        int sum = 0;
//        int i = 0;
//
//        while (i <= max) {
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
//
//        sum = 0;
//        for (i = 1; i <= max; i++){
//            sum += i;
//
//        }
//        System.out.println(sum);


//        for (int i = 1; i < 10; i++){
//            for (int j = 1; j <10; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }

        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
