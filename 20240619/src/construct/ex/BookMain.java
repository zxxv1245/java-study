package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("야호", "효야");
        book2.displayInfo();
        Book book3 = new Book("마지막", "ㅇㄴㅇ", 100);
        book3.displayInfo();

    }
}
