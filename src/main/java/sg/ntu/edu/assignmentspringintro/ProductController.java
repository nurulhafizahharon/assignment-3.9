package sg.ntu.edu.assignmentspringintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts(@RequestParam(required = false) String search) {

        if (search != null) {
            return "You have searched for " + search;
        } else {
            return "This is product page";
        }
    }

    @GetMapping("products/{id}")
    public String getProductsId(@PathVariable int id) {
        return switch (id) {
            case 1 -> "This is detail for ID: " + id + " Product Name: Apple";
            case 2 -> "This is detail for ID: " + id + " Product Name: Banana";
            case 3 -> "This is detail for ID: " + id + " Product Name: Carrot";
            default -> "No product is found";
        };
    }
}
