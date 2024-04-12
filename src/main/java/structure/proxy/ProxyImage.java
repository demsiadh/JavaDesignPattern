package structure.proxy;

import java.util.Objects;

/**
 * <big>代理对象</big>
 *
 * @author 13684
 * @date 2024/4/12
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public ProxyImage() {

    }

    @Override
    public void display() {
        this.realImage = new RealImage(Objects.requireNonNullElse(fileName, "默认文件"));
        this.realImage.display();
    }
}
