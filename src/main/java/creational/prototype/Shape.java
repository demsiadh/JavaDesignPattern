package creational.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <big>型状类-也是其他形状的父类</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
@Getter
@Setter
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    // 浅拷贝
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return clone;
    }
}
