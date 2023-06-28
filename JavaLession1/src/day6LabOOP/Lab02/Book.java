package day6LabOOP.Lab02;

//2. Quản lý thư viện: Xây dựng một hệ thống quản lý thư viện với các lớp như Book, Library và Member.
// Mỗi cuốn sách có thông tin như tên sách, tác giả và số lượng, và các thành viên có thể mượn và trả sách.

public class Book {
    private String title;
    private String category;
    private String author;
    private int quantity;

    public Book(String title, String category, String author, int quantity) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                "}\n";
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
