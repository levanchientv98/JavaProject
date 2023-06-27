package day5OOP.Lab04;

public class JPEGImage extends Image implements Filter{
    private double height;
    private double with;

    private double rotate;

    private String filter;

    public JPEGImage(double height, double with, double rotate, String filter) {
        this.height = height;
        this.with = with;
        this.rotate =rotate;
        this.filter = filter;
    }

    @Override
    public boolean applyFilter() {
        if(filter.equals("filter")){
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        System.out.println("Kich cỡ của ảnh là W x H: " +with+" x "+height);
        System.out.println("Rotate: "+rotate);
        System.out.println("Filter: "+applyFilter());
    }

    @Override
    public void resize(double newW,double newH) {
        with = newW;
        height =newH;
        display();
    }

    @Override
    public void rotate(double newRotate) {
        rotate = newRotate;
        display();
    }
}
