package behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <big>命令调用类</big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order)
    {
        orderList.add(order);
    }

    public void removeOrder(Order order)
    {
        orderList.remove(order);
    }


    public void placeOrders()
    {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
