package customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Controller class for customer service
public class CustomerController {

    @GetMapping("/customer")
    public String hello(){
        return "hello world from customer";
    }
}
