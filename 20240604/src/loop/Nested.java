package loop;

public class Nested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++){
                System.out.println("내부 for i: "+ i + ", j: " + j);
            }
        }
    }
}
