package behavior.command;

/**
 * <big>卖</big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class SellStock implements Order{
    private Stock stock;
    public SellStock(Stock stock) {
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.sell();
    }
}
