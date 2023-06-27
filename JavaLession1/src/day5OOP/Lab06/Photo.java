package day5OOP.Lab06;

public class Photo extends IPhone{
   private String filename;

    public Photo(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "filename='" + filename + '\'' +
                '}';
    }

}
