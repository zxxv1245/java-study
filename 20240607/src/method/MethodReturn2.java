package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자");
            return;
        }
        System.out.println("입장하세요");
    }
}
