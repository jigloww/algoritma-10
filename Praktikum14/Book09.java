package Praktikum14;

public class Book09 {
    public String isbn;
    public String title;

    public Book09() {

    }
    
    public Book09(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}

