package oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account juho = new Account();
        juho.balance = 10000;
        juho.deposit(1000);
        System.out.println("juho.balance = " + juho.balance);
        juho.withdraw(12000);
        System.out.println("juho.balance = " + juho.balance);
    }
}
