package method;

public class Method {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        System.out.println(a + " + " + b + " 연산 수행");
//        int sum1 = a + b
//        System.out.println("결과 출력 " + sum1);

        int sum1 = add(5,10);
        System.out.println("결과1 출력 = " + sum1);





    }

    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;


        return sum;
    }
}
