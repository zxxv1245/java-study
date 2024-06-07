package array;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
//        int[] students = {90, 80, 70, 60, 50};
//
//        int total = 0;
//        for (int student : students) {
//            total += student;
//        }
//        double avg = (double) total / students.length;
//
//        System.out.println("총합 = " + total);
//        System.out.println("평균 = " +  avg);

        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println("5개의 정수를 입력하세요:");
//        for (int i = 0; i < 5; i++){
//            int input = scanner.nextInt();
//            arr[i] = input;
//        }
//
//        for (int i = arr.length-1; i >= 0; i--) {
//            if (i == 0 ) {
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
//        }

//        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
//        int N = scanner.nextInt();
//        int sum = 0;
//        double avg = 0;
//        System.out.println(N + "개의 정수를 입력하세요 : ");
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++){
//            int input = scanner.nextInt();
//            arr[i] = input;
//            sum += arr[i];
//        }
//        avg = (double) sum / N;
//
//        System.out.println("합 = " + sum);
//        System.out.println("평균 = " + avg);


//        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
//        int N = scanner.nextInt();
//        int sum = 0;
//        double avg = 0;
//        System.out.println(N + "개의 정수를 입력하세요 : ");
//        int[] arr = new int[N];
//
//        int minV = 2100000000;
//        int maxV = -2100000000;
//
//        for (int i = 0; i < N; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i : arr) {
//            if (maxV < i) {
//                maxV = i;
//            }
//            if (minV > i) {
//                minV = i;
//            }
//        }
//        System.out.println("min = " + minV);
//        System.out.println("max = " + maxV);


//        int[][] score = new int[4][3];
//        for (int i = 0; i < 4; i++) {
//            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
//            for (int j = 0; j < 3; j++) {
//                if (j == 0) {
//                    System.out.print("국어 점수 : ");
//                    int input = scanner.nextInt();
//                    score[i][j] = input;
//                }
//                if (j == 1) {
//                    System.out.print("영어 점수 : ");
//                    int input =scanner.nextInt();
//                    score[i][j] = input;
//                }
//                if (j == 2) {
//                    System.out.print("수학 점수 : ");
//                    int input = scanner.nextInt();
//                    score[i][j] = input;
//                }
//            }
//        }
//
//        for (int i = 0; i<score.length; i++) {
//            int sum = 0;
//            double avg = 0;
//            for (int j = 0; j<score[i].length; j++){
//                sum += score[i][j];
//            }
//            avg = (double) sum / score[i].length;
//            System.out.println((i+1) + "번 학생의 총점 : " + sum +", 평균 : " + avg);
//        }


        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true){
            System.out.print("메뉴를 선택하세요:");
            int input = scanner.nextInt();
            if (input == 1) {
                if (productCount == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    scanner.nextLine();
                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();
                    productCount++;
                }
            } else if (input == 2) {
                if (productCount == 0 ){
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] +" : "+ productPrices[i]);
                    }
                }

            } else if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다. 다시 선택해주세요");
            }
        }



    }
}
