package Week6;

public class Book {

private String author;
private double price;
private String title;

    public Book(String author, String title, double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public double returnPrice(){
        return price;
    }

    public void changePrice(double newPrice){
        this.price = newPrice;
    }

    public String toString(){
        return "The author of " + title + " is " + author + " and the book price is $" + price;
    }
}
