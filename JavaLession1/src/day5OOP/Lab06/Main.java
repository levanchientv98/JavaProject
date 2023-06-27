package day5OOP.Lab06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        list.add(po1);
        IPhone ip01 = new IPhone(new ArrayList<>(List.of(new Photo("cat.jpg"))));
        IPhone ip02 = new IPhone();
        ip01.airdrop(ip02, "cat.jpg"); // Chia sẻ ảnh từ myIPhone sang otherIPhone
        System.out.println("Danh sách ảnh trên myIPhone: " + ip01.getPhotos());
        System.out.println("Danh sách ảnh trên otherIPhone: " + ip02.getPhotos());
//        ip01.airdrop(ip02, "cat.jpg");
    }
}
