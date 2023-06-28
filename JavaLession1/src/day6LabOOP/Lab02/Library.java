package day6LabOOP.Lab02;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public String getName() {
        return name;
    }

    public Library(String name) {
        this.books = new ArrayList<>();
        this.name = name;
    }

    public void addBook(Book book) {
        boolean bookExists = false;
        for (Book existingBook : books) {
            if (existingBook.getTitle().equals(book.getTitle()) && existingBook.getAuthor().equals(book.getAuthor())) {
                existingBook.setQuantity(existingBook.getQuantity() + book.getQuantity());
                bookExists = true;
                break;
            }
        }
        if (!bookExists) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        for (Book existingBook : books) {
            if (existingBook.getTitle().equals(book.getTitle()) && existingBook.getAuthor().equals(book.getAuthor())) {
                int newQuantity = existingBook.getQuantity() - book.getQuantity();
                if (newQuantity <= 0) {
                    books.remove(existingBook);
                } else {
                    existingBook.setQuantity(newQuantity);
                }
                break;
            }
        }
        System.out.println("Sách "+book.getTitle()+" đã bị xóa ra khỏi thư viện");
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void display(List<Book> listBook){
        for(int i = 0; i < listBook.size(); i++){
            System.out.println(listBook.get(i));
        }
    }

    public boolean borrowBook(Book book) {
        if (book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() );
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        book.setQuantity(book.getQuantity() );
    }
}
