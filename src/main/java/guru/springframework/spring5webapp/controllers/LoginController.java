package guru.springframework.spring5webapp.controllers;

import com.sun.org.apache.xpath.internal.operations.Bool;
import guru.springframework.spring5webapp.domain.LoginForm;
import guru.springframework.spring5webapp.services.KontoBankoweService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController
{

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String openLoginForm()
    {
        return "login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String loginToSystem(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model)
    {
        String nazwaUzytkownikaCoSieLoguje = loginForm.getUsername();
        String nibyjegoHaslo = loginForm.getPassword();
        System.out.println(nazwaUzytkownikaCoSieLoguje + " z haslem: " + nibyjegoHaslo);
        //Boolean czyPoprawneDaneLogowanie = KontoBankoweService.SprawdzUseriHaslo(nazwaUzytkownikaCoSieLoguje,nibyjegoHaslo);
        if (nazwaUzytkownikaCoSieLoguje.equals("admin") && nibyjegoHaslo.equals("admin"))
        {
            return "helloUser";
        }
        if (loginForm.getLogonAttempts() == 3)
        {

            return "zablokowaneKonto";
        }
        model.addAttribute("zledaneLogowania",true);
        return "login";
    }

}
