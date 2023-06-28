package day6LabOOP.Lab02;

import java.util.List;

public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void brrow(Book book, Library library, int numberBook){
        boolean success = library.borrowBook(book);
        if (success){
            System.out.println(name + " đã mượn "+numberBook+" cuốn sách " +book.getTitle());
            int sl = book.getQuantity()-numberBook;
            book.setQuantity(sl);
        }else {
            System.out.println("Xin lỗi, cuốn sách " +book.getTitle() + " hiện không còn trong thư viện.");
        }
    }

    public void bookBack(Book book, Library library,int numberBook){
        library.returnBook(book);
        System.out.println(name + " đã trả " +numberBook + " cuốn sách : " +book.getTitle()+" tại thư viện : " +library.getName()+"\n");
        int sl = book.getQuantity()+numberBook;
        book.setQuantity(sl);
    }
}
