package day5OOP.AccessModifier;

public class ParentClass {
    protected int protectedVariable = 10;

    protected void protecteMethod() {
        System.out.println("This is a protected method");
    }

    final void printMessage() {
        System.out.println("This is a final method");
    }
}

final class FinalClass {
//    Class implemention
}

//class SubClass extends FinalClass{
////    Compilation error: Cannot be modified or overrriden
//}

class Main {
    public static void main(String[] args) {
        ChildClass childObject = new ChildClass();
        childObject.childMethod();
    }
}