package structure.proxy;

/**
 * <big>真正的图像</big>
 *
 * @author 13684
 * @date 2024/4/12
 */
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
