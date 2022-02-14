package Week6;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Homer", "The Adventures of New Life", 15.99);
        System.out.println(book1);
        book1.changePrice(19.99);
        System.out.println(book1);
        System.out.println(book1.returnPrice());
        book1.changePrice(9.99);
        System.out.println(book1.returnPrice());
    }
}
