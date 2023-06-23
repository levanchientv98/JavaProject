package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab02 {
    public static void main(String[] args) {
        // Tìm các và trả về danh sách các ký tự không trùng nhau trong 1 String. Dùng HashMap để giải bài toán này.
        System.out.println(dedupe("aabcc")); // ["b"]
        System.out.println(dedupe("aabbcc")); // []


        // Phân loại các số nguyên tố và các số không phải số nguyên tố
        System.out.println(classifyPrime(List.of(1, 2, 3, 4, 5, 6, 7, 121)));

        // Đếm số lần xuất hiện của 1 ký tự trong 1 chuỗi cho trước
        System.out.println(wordCounter("aaabcc")); // { "a": 3, "b": 1, "c": 2 }
        System.out.println(wordCounter("xyz")); // { "x": 1, "y": 1, "z": 1 }
        System.out.println(wordCounter(""));


        // Tạo class Election (cuộc bầu cử), cung cấp 2 method là vote và winner, mô tả bài toán được thể hiện bên dưới
        Election elec = new Election();
        elec.vote("Obama");
        elec.vote("Abraham Lincon");
        elec.vote("Abraham Lincon");
        String winner = elec.winner();
        System.out.println(winner); // "Abraham Lincon - 2"

        // Tạo class Inventory, cung cấp các method put, get, remove, mô tả bài toán được thể hiện ở bên dưới:
        Inventory inventory = new Inventory();
        // Thêm sản phẩm vào kho hàng
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Laptop", 1200);
        Product product3 = new Product("Phone", 800);
        inventory.put(product1);
        inventory.put(product2);
        inventory.put(product3);
        // Lấy danh sách sản phẩm có cùng tên
        List<Product> laptopProducts = inventory.get("Laptop");
        System.out.println("Laptop products:");
        for (Product product : laptopProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        // Xóa toàn bộ sản phẩm có tên "Laptop"
        boolean isRemoved = inventory.remove("Laptop");
        System.out.println("Is 'Laptop' removed? " + isRemoved);
        // Tính tổng giá trị hàng hóa của sản phẩm "Phone"
        double totalPrice = inventory.totalPriceOf("Phone");
        System.out.println("Total price of 'Phone' products: " + totalPrice);
        // Đếm tổng số lượng hàng hóa của sản phẩm "Laptop"
        int totalCount = inventory.countTotal("Laptop");
        System.out.println("Total count of 'Laptop' products: " + totalCount);

    }

    //    #### 1. Tìm các và trả về danh sách các ký tự không trùng nhau trong 1 String. Dùng HashMap để giải bài toán này.
    public static List<Character> dedupe(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Character> uniqueCharacters = new ArrayList<>();
        // Lấy danh sách các ký tự không trùng nhau
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueCharacters.add(entry.getKey());
            }
        }

        return uniqueCharacters;
    }

    // Câu 2:  Phân loại các số nguyên tố và các số không phải số nguyên tố
    public static HashMap<String, List<Integer>> classifyPrime(List<Integer> nums) {
        HashMap<String, List<Integer>> result = new HashMap<>();
        List<Integer> primeList = new ArrayList<>();
        List<Integer> notPrimeList = new ArrayList<>();
        for (int num : nums) {
            if (isPrime(num)) {
                primeList.add(num);
            } else {
                notPrimeList.add(num);
            }
        }
        result.put("prime", primeList);
        result.put("not_prime", notPrimeList);
        return result;
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    Câu 3: Đếm số lần xuất hiện của 1 ký tự trong 1 chuỗi cho trước
    static HashMap<String, Integer> wordCounter(String word) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String character = String.valueOf(word.charAt(i));
            countMap.put(character, countMap.getOrDefault(character, 0) + 1);
        }
        return countMap;
    }

}
