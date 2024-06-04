package scope;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
//        if (true) {
//            int a = 20;
//            System.out.println("if x = " + x);
//            System.out.println("if a = " + a);
//        } // if 문 안에서 a를 선언 했기 때문에 if 문 밖에서는 a를 사용하지 못함
//        System.out.println("if x = " + x);
////        System.out.println("if a = " + a); 에러

//        for (int i = 0; i <2; i++) {
//            System.out.println("for x = " + x);
//            System.out.println("for i = " + i);
//        }


        if (x > 0) {
            int temp = x * 2;
            System.out.println("temp = " + temp);

        }
        System.out.println("x = " + x);
    } // 이 안에서만 x 사용 가능


}
