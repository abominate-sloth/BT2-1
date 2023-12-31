package by.bsuir.lab1.task14;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book book) || obj.hashCode() != hashCode()) {
            return false;
        }

        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }


    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() + Integer.valueOf(price).hashCode() + 12;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition + "\n";
    }

    @Override
    public Book clone()
    {
        Book book = new Book(this.title, this.author, this.price);
        return book;
    }
}
