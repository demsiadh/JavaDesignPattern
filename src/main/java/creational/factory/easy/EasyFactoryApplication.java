package creational.factory.easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * <big>简单工厂模式</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class EasyFactoryApplication {
    public static void main(String[] args) {
        RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new RoujiaMoFactory());
        RoujiaMo roujiaMo = roujiaMoStore.sellRoujiaMo("Suan");
        System.out.println(roujiaMo.name);
    }
}
