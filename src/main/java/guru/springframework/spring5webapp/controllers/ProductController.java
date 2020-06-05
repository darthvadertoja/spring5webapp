package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController
{

    @RequestMapping("/show")
    public String showProduct(Model model)
    {
        Product mojProdukt = new Product();
        mojProdukt.setBrand("Sony");
        mojProdukt.setId(4L);
        mojProdukt.setName("BRAVIA 60");
        model.addAttribute("produkt",mojProdukt);
        return "products";


    }
}
