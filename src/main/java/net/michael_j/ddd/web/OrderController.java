package net.michael_j.ddd.web;


import net.michael_j.ddd.service.application.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderServiceImpl orderService;

    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create.do")
    public String createOrder(long uid, String name, String content) {
        orderService.createOrder(uid, name, content);
        return "order create completed!";
    }
}
