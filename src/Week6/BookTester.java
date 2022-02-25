package Week6;

public class BookTester {
    public static void main(String[] args) {
//        Book book1 = new Book("Homer", "The Adventures of New Life", 15.99);
//        System.out.println(book1);
//        book1.changePrice(19.99);
//        System.out.println(book1);
//        System.out.println(book1.returnPrice());
//        book1.changePrice(9.99);
//        System.out.println(book1.returnPrice());
        Textbook txtbook1 = new Textbook("The Title", 19.99, "Dr. Title", "About Title");
        System.out.println(txtbook1);
        txtbook1.addResources("www.elpasotimes.com");
        System.out.println(txtbook1);

        Textbook text = txtbook1;
    }


}
