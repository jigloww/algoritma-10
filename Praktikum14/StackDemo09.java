package Praktikum14;

import java.util.Stack;
public class StackDemo09 {
    public static void main(String[] args) {
        Stack<Book09> bookS = new Stack<>();
        
        Book09 book1 = new Book09("1234", "Dasar Pemrograman");
        Book09 book2 = new Book09("7145", "Hafalah Shalat Delisa");
        Book09 book3 = new Book09("3562", "Muhammad Al-Fatih");

        Stack<Book09> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book09 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book09 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book09 book : books) {
            System.out.println(book.toString());
        }  

        System.out.println(books);
    }
}
