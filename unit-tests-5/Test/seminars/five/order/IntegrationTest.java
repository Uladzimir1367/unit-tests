package seminars.five.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 */
public class IntegrationTest {
    @Test
    void testPaymentService(){
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("A", 1);

        assertTrue(result);
    }
}
