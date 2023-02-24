import com.ocp.order.OrderService;
import com.ocp.order.OrderServiceImpl;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderServiceImpl();

        orderService.placed(30000);


    }
}