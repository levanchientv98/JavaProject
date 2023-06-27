package day5OOP.AccessModifier;

 public class ChildClass extends ParentClass {

    //    Cannot override the final method printMessage()
    public void childMethod() {
        System.out.println("This is a child method");
        System.out.println("Accessing the protected variable from the parent class: " + protectedVariable);
        protecteMethod();
    }
}
