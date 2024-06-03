package variable;

public class Var {
    public static void main(String[] args) {
//        System.out.println(10);
//
//        int a; // 변수 선언(출력하기 전에 초기화해야함)
//        a = 10; // 뱐수 초기화
//        System.out.println(a);
//
//        int b = 2; // 선언 초기화 한 번에
//
//        int c = 3, d = 4; // 여러개 선언 초기화 한 번에

        //type
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;
        double d = 10.0;

        // 불린형
        boolean booleanVar = true;

        // 문자형
        char charVar = 'A';
        String StringVar = "Hello Java";


        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println(num1 + num2);

        System.out.println(sum);
    }
}
