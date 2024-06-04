package cond;

public class CondOpCopy {
    public static void main(String[] args) {
        // 삼항 연산자(조건 연산자)
        int age = 21;
        String status = (age >= 20) ? "어른" : "어린이";
        System.out.println("status = " + status);
    }
}
