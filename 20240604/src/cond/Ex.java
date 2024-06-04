package cond;

public class Ex {
    public static void main(String[] args) {
        int score = 52;
        String myScore;

        if (score >= 90) {
            myScore = "A";
        } else if (score >= 80) {
            myScore = "B";
        } else if (score >= 70) {
            myScore = "C";
        } else if (score >= 60) {
            myScore = "D";
        } else {
            myScore = "F";
        }
        System.out.println("학점은 " + myScore +"입니다.");


        int distance = 123;

        if (distance > 100) {
            System.out.println("비행기 타기");
        } else if (distance > 10) {
            System.out.println("차 타라");
        } else if (distance > 1) {
            System.out.println("자전거 타라");
        } else {
            System.out.println("좀 걸어");
        }

        int dollar = -1;

        if (dollar >= 1) {
            System.out.println("환전 금액은 " + dollar * 1300 + "원입니다.");
        } else if (dollar == 0) {
            System.out.println("돈이 없습니다.");
        } else {
            System.out.println("적자입니다.");
        }


        double rating = 7;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }

        String grade = "Fds";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 성적입니다.");
                break;
        }

        int a = 30;
        int b = 20;

        System.out.println("더 큰 숫자는 " + ((a>b) ? a:b) + "입니다.");

        int x = 2313;

        String status = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println(status);
    }
}
