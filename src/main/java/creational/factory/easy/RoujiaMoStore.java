package creational.factory.easy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * <big>肉夹馍店</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class RoujiaMoStore {
    private RoujiaMoFactory factory;

    public RoujiaMoStore(RoujiaMoFactory factory) {
        this.factory = factory;
    }
    /**
     * 根据传入类型卖一个肉夹馍
     *
     * @param type 类型
     * @return {@code RoujiaMo}
     */
    public RoujiaMo sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.createRoujiaMo(type);
        roujiaMo.sell();
        return roujiaMo;
    }
}
