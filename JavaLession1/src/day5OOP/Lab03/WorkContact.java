package day5OOP.Lab03;

public class WorkContact implements Contact {
    private String name;
    private String phone;

    public WorkContact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phone;
    }

    @Override
    public void displayContactInfo() {
        System.out.println("Work Contact");
        System.out.println("Name: "+getName()+ "\tPhone: "+getPhoneNumber());
    }
}
