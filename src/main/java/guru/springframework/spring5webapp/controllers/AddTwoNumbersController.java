package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddTwoNumbersController
{
    //GET VS POST
    @RequestMapping("/add")
     public String add(@RequestParam("t1") int i,@RequestParam("t2") int j, Model model)
    {
        //int i = 35;
        //int j = 36;
        int suma = i +j;
        model.addAttribute("suma",suma);
        return "suma";
    }
}
