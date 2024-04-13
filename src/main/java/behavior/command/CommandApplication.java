package behavior.command;

/**
 * <big>命令模式</big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class CommandApplication {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.removeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
