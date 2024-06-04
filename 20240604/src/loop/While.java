package loop;

public class While {
    public static void main(String[] args) {
//        int count = 0;
//
//        while (count < 100) {
//            count ++;
//            System.out.println("숫자는 " + count);
//        }
//        int sum = 0;
//        int i = 1;
//        int endNum = 3;
//        while (i <= endNum) {
//
//            sum += i;
//            System.out.println("i = " + i + " sum = " + sum);
//            i++;
//        }

//        //do- while
//        int i = 10;
//
//        do {
//            System.out.println("현재 숫자는 " + i);
//            i ++;
//        } while (i<3);


        //break, continue
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("10보다 크면 종료" + " sum = " + sum + " i = " + i);
                break;
            }
            i++;
        }


        i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
