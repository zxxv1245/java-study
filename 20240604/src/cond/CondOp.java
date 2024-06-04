package cond;

public class CondOp {
    public static void main(String[] args) {
        int age = 19;
        String status;
        
        if (age >= 20) {
            status = "으른";
        } else {
            status = "어린이";
        }

        System.out.println("status = " + status);
    }
}
