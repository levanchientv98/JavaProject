package day5OOP.Lab03;

public class FriendContact implements Contact{
    private String name;
    private String phone;

    public FriendContact(String name, String phone) {
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
        System.out.println("Friend Contact");
        System.out.println("Name: "+getName()+ "\tPhone: "+getPhoneNumber());

    }
}
