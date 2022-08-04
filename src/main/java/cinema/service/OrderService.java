package cinema.service;

import cinema.model.ShoppingCart;
import cinema.model.User;
import java.util.List;
import cinema.model.Order;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
