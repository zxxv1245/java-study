package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 = " + a);
        ChangeValue(a);
        System.out.println("메서드 호출 후 = " + a);

    }
    public static void ChangeValue(int x) {
        x = 20;
    }
}
