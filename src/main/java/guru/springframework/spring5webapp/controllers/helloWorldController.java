package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWorldController
{
    //www.witek.com/hello
    //michal.com/hello

    @RequestMapping("/hello")
    public String printHelloToWebUser()
    {
        System.out.println("metoda printHelloToWebUser zostala uruchomiona");
        return "helloUser";
    }

}
