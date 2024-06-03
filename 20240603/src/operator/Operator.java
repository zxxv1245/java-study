package operator;

public class Operator {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 2;
//
//        // 연산
//        // 덧셈
//        int sum = a + b;
//        System.out.println("sum = " + sum);
//
//        // 뺄셈
//        int diff = a - b;
//        System.out.println("diff = " + diff);
//
//        // 곱셈
//        int multi =  a * b;
//        System.out.println("multi = " + multi);
//
//        // 나눗셈
//        int div = a / b; // int형끼리 나누면 소수점 안나옴 정수형으로 표현됨
//        System.out.println("div = " + div);
//
//        // 나머지
//        int mod = a % b;
//        System.out.println("mod = " + mod);

//        // 문자열 연산자
//        // 문자열 문자열 더하기
//        String result1 = "hello" + "world";
//        System.out.println("result1 = " + result1);
//
//        String s1 = "string1";
//        String s2 = "string2";
//        String result2 = s1 + s2;
//        System.out.println("result2 = " + result2);
//
//        // 문자열 숫자 더하기
//        String result3 = "a + b = " + 10; // 형변환 됨?
//        System.out.println("result3 = " + result3);
//
//        int num = 20;
//        String str = "a + b = ";
//        String result4 = str + num;
//        System.out.println("result4 = " + result4);
//
//        //연산자 우선순위
//
//        int sum1 = 1 + 2 * 3;
//        System.out.println("sum1 = " + sum1);
//        int sum2 = (1 + 2) * 3;
//        System.out.println("sum2 = " + sum2);
//
//        int sum3 = 2 * 2 + 3 * 3;
//        System.out.println("sum3 = " + sum3);
//        int sum4 = (2 * 2) + (3 * 3);
//        System.out.println("sum4 = " + sum4);
//
//
//        // 증감 연산자
//
//        int aa = 0;
//        aa = aa + 1;
//        System.out.println("aa = " + aa);
//
//
//        // 전위 증감 연산자
//        ++aa;
//        System.out.println("aa = " + aa);
//
//        // 후위 증감 연산자
//        aa++;
//        System.out.println("aa = " + aa);
//
//        aa += 2;
//        System.out.println("aa = " + aa);
//
//        int bb = 10;
//
//        bb = bb - 1;
//        System.out.println("bb = " + bb);
//
//
//
//        --bb;
//        System.out.println("bb = " + bb);
//
//        bb--;
//        System.out.println("bb = " + bb);
//
//        bb -= 2;
//        System.out.println("bb = " + bb);
//
//
//
//        int cc = 0;
//
//        cc = ++aa; //aa의 값을 먼저 증가시키고, 그 결과를 cc에 대입
//        System.out.println("cc = " + cc);
//
//
//        cc = 0;
//
//        cc = aa++; //aa의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
//        System.out.println("cc = " + cc);
//        System.out.println("aa = " + aa);

        // 비교 연산자
        // == 같다
        // != 다르다
        // > 크다
        // < 작다
        // >= 크거나 같다
        // <= 작거나 같다

//        int a = 1;
//        int b = 0;
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a >= b);
//
//        boolean result = a == b;
//        System.out.println("result = " + result);

//        // 문자열 비교
//        // .equals() 메서드
//        String str1 = "문자열1";
//        String str2 = "문자열2";
//
//        boolean result1 = "hello".equals("hello");
//        boolean result2 = "hello".equals("문자열1");
//        boolean result3 = "hello".equals(str2);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);

//        // 논리 연산자
//        // && and
//        // || or
//        // !  not
//
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && false);
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || false);
//
//        System.out.println(!true);
//        System.out.println(!false);
//
//        int a = 15;
//
//        boolean result = 10 < a && a < 20;
//        System.out.println("result = " + result);
        
//        // 대입 연산자
//        int a = 5;
//        a += 3;
//        System.out.println("a = " + a);
//        a -= 2;
//        System.out.println("a = " + a);
//        a *= 4;
//        System.out.println("a = " + a);
//        a /= 2;
//        System.out.println("a = " + a);
//        a %= 5;
//        System.out.println("a = " + a);

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        int avgrage = sum / 3;
        System.out.println("avgrage = " + avgrage);
        System.out.println("sum = " + sum);

        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;
        double valsum = val1 + val2 + val3;
        double valavg = valsum / 3 ;
        System.out.println("valavg = " + valavg);
        System.out.println("valsum = " + valsum);
        
        int score = 85 ;
        boolean result = 80 <= score && score <= 100;
        System.out.println("result = " + result);
    }
}
