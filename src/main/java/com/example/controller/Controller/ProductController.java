package com.example.controller.Controller;

import com.example.controller.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {
    private List<Product> products = new ArrayList<>();


    public ProductController() {
        products.add(new Product(1, "Trà sữa truyền thống", 25000));
        products.add(new Product(2, "Trà sữa matcha", 30000));
        products.add(new Product(3, "Trà sữa socola", 28000));
    }

    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products", products);
        return "/product";
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("id") int id) {
        products.removeIf(p -> p.getId() == id);
        return "redirect:/products";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam("keyword") String keyword, Model model) {
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());

        model.addAttribute("products", filteredProducts);
        return "/product";
    }

}
