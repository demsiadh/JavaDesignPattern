package behavior.nullObject;

/**
 * <big>真对象</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:22
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
