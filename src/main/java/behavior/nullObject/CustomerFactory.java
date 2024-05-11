package behavior.nullObject;

/**
 * <big></big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:25
 */
public class CustomerFactory {
    private static final String[] NAMES = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : NAMES) {
            if (s.equals(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
