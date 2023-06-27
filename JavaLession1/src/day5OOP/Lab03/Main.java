package day5OOP.Lab03;

public class Main {
    public static void main(String[] args) {
        FriendContact fc = new FriendContact("Son", "0123456789");
        WorkContact wc = new WorkContact("Long", "0969967234");
        fc.displayContactInfo();
        wc.displayContactInfo();
    }
}
