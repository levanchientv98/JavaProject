package day5OOP.Lab06;

import java.util.ArrayList;
import java.util.List;

public class IPhone  {
    private List<Photo> photos;

    public IPhone() {
        this.photos = new ArrayList<Photo>();;
    }

    public IPhone(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public void airdrop(IPhone other, String id){
        for(Photo photo : photos)
        {
            if(photo.getFilename().equals(id)) {
                other.addPhoto(photo);
                break;
            }
        }
        System.out.println("Đã chia sẻ ảnh thành công cho IPhone khác.");
    }

}
