package day5OOP.Enum;

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: "+today);
        if(today == Day.SATURDAY || today == Day.SUNDAY){
            System.out.println("It's the weeken!");
        }else {
            System.out.println("It's a weekday!");
        }
        switch (today){
            case MONDAY:
            case TUSESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
        }
    }
}
