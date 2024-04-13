package behavior.command;

/**
 * <big>买</big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class BuyStock implements Order{
    private Stock stock;
    public BuyStock(Stock stock) {
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}
