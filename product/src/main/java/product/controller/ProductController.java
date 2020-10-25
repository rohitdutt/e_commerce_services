package product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Controller class for product service
public class ProductController {

    @GetMapping("/product")
    public String hello(){
        return "hello world from product";
    }
}
