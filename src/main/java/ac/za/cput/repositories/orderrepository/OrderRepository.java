package ac.za.cput.repositories.orderrepository;

import ac.za.cput.domains.order.Order;
import ac.za.cput.repositories.IRepository;

import java.util.Set;

public interface OrderRepository extends IRepository<Order, String> {

    Set<Order> getAll();

}
