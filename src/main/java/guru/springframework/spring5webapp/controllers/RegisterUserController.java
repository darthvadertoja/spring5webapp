package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterUserController
{
    @RequestMapping("/register")
    public String przeslijFormularzUzytkownika(@ModelAttribute("user") User user)
    {
        userService.save(user);
        return "register_success";
    }
}
