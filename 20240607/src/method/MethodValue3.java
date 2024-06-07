package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1 호출 전 num = " + num);
        num = changeNumber(num);
        System.out.println("4 호출 후 num = " + num);
    }

    public static int changeNumber(int num) {
        System.out.println("2 변경 전 num = " + num);
        num = num * 2;
        System.out.println("3 변경 후 num = " + num);
        return num;
    }
}
