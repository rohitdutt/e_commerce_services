package order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//controller class for order service
public class OrderController {
    @GetMapping("/order")
    public String hello(){
        return "hello world from order";
    }
}
