package day5OOP.Lab04;

public class Main {
    public static void main(String[] args) {
        JPEGImage image1 = new JPEGImage(80, 160, 90, "filter" );
        image1.display();
        image1.resize(80,40);
        image1.rotate(180);
    }
}
