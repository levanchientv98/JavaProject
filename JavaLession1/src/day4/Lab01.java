package day4;

import java.util.*;

public class Lab01 {
//1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.
//2. Viết một chương trình để tạo một HashSet từ một ArrayList.
//3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.
//4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.
//5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.
//6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.
//7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.
//8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần.
//9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.
//10. Xóa các phần tử trùng lặp từ một ArrayList.
//11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.
//12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.
//13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.
//14. Kiểm tra xem một ArrayList có rỗng hay không.
//15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.
//16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.
//17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.
//18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.
//19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.
//20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.
    public static void main(String[] args) {
       menuFunction();
       inputFunciton();
    }

//  Menu
    public static void menuFunction(){
        System.out.print("+");
        for (int i = 0; i < 75 - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        // Print middle rows
        System.out.println(" 1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử");
        System.out.println(" 2. Viết một chương trình để tạo một HashSet từ một ArrayList");
        System.out.println(" 3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách");
        System.out.println(" 4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList");
        System.out.println(" 5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục");
        System.out.println(" 6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không");
        System.out.println(" 7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái");
        System.out.println(" 8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần");
        System.out.println(" 9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet");
        System.out.println(" 10. Xóa các phần tử trùng lặp từ một ArrayList");
        System.out.println(" 11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.");
        System.out.println(" 12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản");
        System.out.println(" 13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.");
        System.out.println(" 14. Kiểm tra xem một ArrayList có rỗng hay không.");
        System.out.println(" 15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.");
        System.out.println(" 16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.");
        System.out.println(" 17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.");
        System.out.println(" 18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.");
        System.out.println(" 19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.");
        System.out.println(" 20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.");
        System.out.println(" 0. Thoát");
        // Print bottom border
        System.out.print("+");
        for (int i = 0; i < 75 - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void inputFunciton() {
        String numberFunciton;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chức năng: ");
        numberFunciton = sc.nextLine();
        boolean flag = true;
        while (flag) {
            switch (numberFunciton) {
                case "0" -> System.exit(0);
                case "1" -> {
                    ArrayList<Integer> nums = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("nums["+ i+"] = ");
                        nums.add(sc.nextInt());
                    }
                    System.out.println("Tổng các phần tử trong ArrayList Sum = "+sumArrayList(nums));
                    menuFunction();
                    inputFunciton();
                }
                case "2" -> {
                    ArrayList<String> arr02 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr02.add(sc.next());
                    }
                    System.out.println(createHashSetFromArrayList(arr02));
                    menuFunction();
                    inputFunciton();
                }
                case "3" -> {
                    LinkedList<String> arr03 = new LinkedList<>();
                    System.out.print("Chọn số phần từ trong LinkedList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("LinkedList["+ i+"] = ");
                        arr03.add(sc.next());
                    }
                    System.out.println(arr03);
                    System.out.println(reverse(arr03));
                    menuFunction();
                    inputFunciton();
                }
                case "4" -> {
                    ArrayList<Integer> arr04 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("nums["+ i+"] = ");
                        arr04.add(sc.nextInt());
                    }
                    maxArrayList(arr04);
                    menuFunction();
                    inputFunciton();
                }
                case "5" -> {
                    HashMap<String, Float> studentMap = new HashMap<>();
                    System.out.print("Chọn số học sinh trong HashMap n = ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++){
                        System.out.print("student["+ i+"] = Name:\t? GPA:\t? ");
                        studentMap.put(sc.next(), sc.nextFloat());
                    }
                    createStudent(studentMap);
                    menuFunction();
                    inputFunciton();
                }
                case "6"->{
                    ArrayList<String> arr06 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr06.add(sc.next());
                    }
                    System.out.println(arr06);
                    System.out.print("Chọn phần tử muốn kiểm tra trong ArrayList check = ");
                    String check = sc.next();
                    checkArrayList(arr06,check);
                    menuFunction();
                    inputFunciton();
                }
                case "7"->{
                    ArrayList<String> arr07 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr07.add(sc.next());
                    }
                    System.out.println(arr07);
                    alphabetize(arr07);
                    menuFunction();
                    inputFunciton();
                }
                case "8"->{
                    ArrayList<Integer> arr08 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr08.add(sc.nextInt());
                    }
                    System.out.println(createTreeSetFromArrList(arr08));
                    menuFunction();
                    inputFunciton();
                }
                case "9"->{
                    ArrayList<String> arr09 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr09.add(sc.next());
                    }
                    System.out.println(addAllInHashSet(arr09));
                    menuFunction();
                    inputFunciton();
                }
                case "10"->{
                    ArrayList<String> arr10 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr10.add(sc.next());
                    }
                    System.out.println(deletedDoubleElement(arr10));
                    menuFunction();
                    inputFunciton();
                }
                case "11"->{
                    ArrayList<String> arr11 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr11.add(sc.next());
                    }
                    ArrayList<String> newArrayList = copyArrayList(arr11);
                    System.out.println("Old ArrayList: "+ arr11);
                    System.out.println("New ArrayList: "+newArrayList);
                    menuFunction();
                    inputFunciton();
                }
                case "12"->{
                    System.out.print("Nhập đoạn văn: ");
                    String str = sc.nextLine();
                    System.out.print("Nhập từ muốn kiểm tra: ");
                    String words = sc.next();
                    System.out.println(checkWordsThatApper(str, words));
                    menuFunction();
                    inputFunciton();
                }
                case "13"->{
                    LinkedList<String> arr13 = new LinkedList<>();
                    System.out.print("Chọn số phần từ trong LinkedList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("LinkedList["+ i+"] = ");
                        arr13.add(sc.next());
                    }
                    System.out.print("Nhập phần từ cần tìm số lần xuất hiện trong LinkedList: ");
                    String s =sc.next();
                    System.out.println("Số lần xuất hiện của '"+s+"' trong LinkedList là: "+countOccurrences(arr13,s));
                    menuFunction();
                    inputFunciton();
                }
                case "14"->{
                    ArrayList<String> arr14 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr14.add(sc.next());
                    }
                    System.out.println("Kiểm tra mảng Array List có rỗng hay không:");
                    if(checkEmpty(arr14)){
                        System.out.println("ArrayList rỗng ");
                    }else {
                        System.out.println("ArrayList không rỗng ");
                    }
                    menuFunction();
                    inputFunciton();
                }
                case "15"->{
                    ArrayList<String> arr15 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr15.add(sc.next());
                    }
                    System.out.print("Chọn vị trí: ");
                    int index = sc.nextInt();
                    System.out.print("Tại vị trí '"+index+"' từ cần thêm là ");
                    String str = sc.next();
                    System.out.println(insertArrayList(arr15,index,str));
                    menuFunction();
                    inputFunciton();
                }
                case "16"->{
                    ArrayList<String> arr16 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr16.add(sc.next());
                    }
                    priorityQueue01(arr16);
                    menuFunction();
                    inputFunciton();
                }
                case "17"->{
                    ArrayList<Integer> arr17 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList1 n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList1["+ i+"] = ");
                        arr17.add(sc.nextInt());
                    }
                    ArrayList<Integer> arr16 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList1 n = ");
                    int c = sc.nextInt();
                    for (int i = 0; i < c; i++){
                        System.out.print("ArrayList2["+ i+"] = ");
                        arr16.add(sc.nextInt());
                    }
                    boolean containsAll = containsAllElements(arr17,arr16);
                    System.out.printf("List1 chứa tất cả các phần tử của List2: " +containsAll);
                    menuFunction();
                    inputFunciton();
                }
                case "18"->{
                    LinkedList<String> arr18 = new LinkedList<>();
                    System.out.print("Chọn số phần từ trong ArrayList1 n = ");
                    int n = sc.nextInt();
                    boolean isValid;
                    do {
                        for (int i = 0; i < n; i++) {
                            System.out.print("LinkedList[" + i + "] = ");
                            arr18.add(sc.next());
                        }
//                        Kiểm tra list
                        isValid = true;
                        for(String element : arr18){
                            try {
                                Integer.parseInt(element);
                            }catch (NumberFormatException e){
                                System.out.println("Lỗi: List chỉ chứa các số nguyên! ");
                                arr18.clear();
                                isValid = false;
                                break;
                            }
                        }
                        }while (!isValid);
                    System.out.println("LinkedList trước khi sắp xếp " +arr18);
                    sortDesc(arr18);
                    System.out.println("LinkedList sau khi sắp xếp giảm dần " +arr18);
                    menuFunction();
                    inputFunciton();
                }
                case "19"->{
                    ArrayList<String> arr19 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList1 n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr19.add(sc.next());
                    }
                    createHashSetFromArr(arr19);
                    menuFunction();
                    inputFunciton();
                }
                case "20"->{
                    ArrayList<String> arr20 = new ArrayList<>();
                    System.out.print("Chọn số phần từ trong ArrayList1 n = ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        System.out.print("ArrayList["+ i+"] = ");
                        arr20.add(sc.next());
                    }
                    getFirstLastElement(arr20);
                    menuFunction();
                    inputFunciton();
                }
                default -> {
                    System.out.println("Chọn lại chức năng trong khoảng 0 -> 16");
                    inputFunciton();
                    flag = false;
                }
            }
        }
    }

//  Câu 1
    public static int sumArrayList (ArrayList<Integer> arr){
        int sum = 0;
        for (Integer integer : arr) {
            sum = sum + integer;
        }
        return sum;
    }

//  Câu 2
    public static HashSet<String> createHashSetFromArrayList(ArrayList<String> arr) {
        HashSet<String> hashSet01 = new HashSet<>(arr);
        System.out.println("HashSet contains:");
        return hashSet01;
    }


//  Câu 3:
    public static List<String> reverse(LinkedList<String> arr) {
        LinkedList<String> mylist = new LinkedList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            mylist.add(arr.get(i));
        }
        return mylist;
    }

//  Câu 4
    public static void maxArrayList(ArrayList<Integer> arr){
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++){
            if(max <= arr.get(i)){
                max = arr.get(i);
            }
        }
        System.out.println("Số lớn nhất trong ArrayList là: " +max);
    }
//    Câu 5 Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục
    public static void createStudent(HashMap<String,Float> studentMap){
        System.out.println("Student info in the HashMap: ");
        for (Map.Entry<String, Float> entry: studentMap.entrySet()){
            String name =entry.getKey();
            float point =entry.getValue();
            System.out.println("Name: " +name+" , GPA: "+point);
        }
    }
//   Câu 6 Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không
    public static void checkArrayList(ArrayList<String> arr,String s){
        boolean contains = arr.contains(s);
        System.out.println("Does the list contain '"+s+"' ? "+contains);

    }
//  Câu 7 Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái
    public static void alphabetize(ArrayList<String> arr){
        Collections.sort(arr);
        System.out.println("Sorted ArrayList");
        System.out.println(arr);
    }
//  Câu 8 Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần
    public static TreeSet<Integer> createTreeSetFromArrList(ArrayList<Integer> arr){
        TreeSet<Integer> treeSet01 = new TreeSet<>(arr);
        System.out.println("TreeSet contains");
        return treeSet01;
    }
//   Câu 9 Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet
    public static HashSet<String> addAllInHashSet(ArrayList<String> arr){
        HashSet<String> result = new HashSet<>();
        result.add("SonGPT");
        result.addAll(arr);
        System.out.println("HashSet contains");
        return result;
    }
//   Câu 10: Xóa các phần tử trùng lặp từ một ArrayList
    public static ArrayList<String> deletedDoubleElement(ArrayList<String> arr){
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        System.out.println("ArrayList sau khi xóa các element trùng lặp: ");
        return result;
    }

//  Câu 11  Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.
    public static ArrayList<String> copyArrayList(ArrayList<String> arr){
        return new ArrayList<>(arr);
    }
// Câu 12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.
    public static TreeMap<String,Integer> checkWordsThatApper(String str, String s){
        TreeMap<String, Integer> result = new TreeMap<>();
        int count = 0;
        String[] words =str.split(" +");
        for (String w: words){
            if(w.contains(s)){
                count++;
                result.put(s,count);
            }
        }
        return result;
    }
//  Câu 13 Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.
    public static int countOccurrences(LinkedList<String> myLinked, String targetElement){
        int count = 0;
        for (String element : myLinked){
            if(targetElement.equals(element) ){
                count++;
            }
        }
        return count;
    }
//  Câu  14. Kiểm tra xem một ArrayList có rỗng hay không.
    public static boolean checkEmpty(ArrayList<String> arr){
        return arr.isEmpty();
    }
//   Câu 15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.
    public static ArrayList<String> insertArrayList(ArrayList<String> arr,int index,String str){
        arr.add(index,str);
        return arr;
    }

//   Câu 16 Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.
    public static void priorityQueue01(ArrayList<String> arr){
        PriorityQueue<String> myQueue = new PriorityQueue<>(arr);
        while (!myQueue.isEmpty()){
            String element = myQueue.poll();
            System.out.print("\t"+element);
        }
    }
//    Câu 17:  Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.
    public static boolean containsAllElements(List<Integer> list1, List<Integer> list2){
        return new HashSet<>(list1).containsAll(list2);
    }
//    Câu 18:Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.
    public static void sortDesc(LinkedList<String> myLinkedList){
        myLinkedList.sort(Comparator.reverseOrder());
    }

//    Câu 19: Tạo một HashSet từ một mảng và in ra tất cả các phần tử.
    public static void createHashSetFromArr(ArrayList<String> arr){
        HashSet<String> set = new HashSet<>(arr);
        System.out.println("HashSet Contains: "+set);
    }
//    Câu 20: Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.
    public static void getFirstLastElement(ArrayList<String> arr){
        if(arr.isEmpty()){
            System.out.println("ArrayList rỗng ");
        }else {
            System.out.println("Phân tử đầu tiên là: "+arr.get(0));
            System.out.println("Phân tử cuối cùng là: "+arr.get(arr.size()-1));
        }
    }
}
