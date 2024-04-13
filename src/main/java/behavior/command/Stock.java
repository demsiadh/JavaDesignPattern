package behavior.command;

/**
 * <big>请求类</big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class Stock {
    private final String name = "ABC";
    private final int quantity = 10;
    public void buy()
    {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell()
    {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
