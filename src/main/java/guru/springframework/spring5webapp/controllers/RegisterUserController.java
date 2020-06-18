package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterUserController
{

    //@GetMapping("/register")
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(Model model)
    {
        User user = new User();
        model.addAttribute("user",user);
        return "register_form";
    }

    //odebranie danych ze strony
    //@PostMapping("/register")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String submitRegistrationForm(@ModelAttribute("user") User user)
    {
        System.out.println(user);//save
        return "register_success";
    }


}
