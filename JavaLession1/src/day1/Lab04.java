package day1;

public class Lab04 {
    public static void main(String[] args) {
        String str = "Hello Long GPT";
        char[] array = str.toCharArray();
        String result = String.copyValueOf(array);

        System.out.println(str);
        System.out.println(result);
    }
}
