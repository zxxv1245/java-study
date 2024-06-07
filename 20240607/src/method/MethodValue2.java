package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("호출 전 num = " + num);
        changeNumber(num);
        System.out.println("호출 후 num = " + num);
    }

    public static void changeNumber(int num) {
        System.out.println("변경 전 num = " + num);
        num = num * 2;
        System.out.println("변경 후 num = " + num);
    }
}
