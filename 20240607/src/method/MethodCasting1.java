package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // double을 int형에 대입했으므르 컴파일 오류
        printNumber((int) number); // 명시적 형변환으로 대입
    }
    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
