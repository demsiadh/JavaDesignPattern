package behavior.nullObject;

/**
 * <big>空对象</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:22
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
