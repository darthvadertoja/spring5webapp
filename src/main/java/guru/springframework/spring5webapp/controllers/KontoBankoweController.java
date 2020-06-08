package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.domain.KontoBankowe;
import guru.springframework.spring5webapp.services.KontoBankoweService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KontoBankoweController
{

    @Autowired
    private KontoBankoweService kontoService;


    @RequestMapping("/pokazKonta")
    public String pokazKonta(Model model)
    {
        model.addAttribute("listaKont", kontoService.listAll());
        return "listaKontBankowych";
    }

    @RequestMapping("/noweko")
    public String utworzNoweKonto( Model model)
    {
        KontoBankowe noweKonto = new KontoBankowe();
        model.addAttribute("konto", noweKonto);
        return "noweKonto";
    }

    //metoda POST - przez formularz przekazuje parametry
    @RequestMapping(value = "/zapiszKonto", method = RequestMethod.POST)
    public String saveKontoBankowe(@ModelAttribute("konto") KontoBankowe kontoCoDaliMiNaNecie)
    {
        kontoService.save(kontoCoDaliMiNaNecie);
        return "kontoTemplate";
    }




    //metoda GET - przez pasek adresu w przegladarce przekazuje parametry
    ///  http://localhost:8899/save?i=michal&s=12&n=hdh373
    @RequestMapping("/save")
    public String saveKontoBankowe(@RequestParam("i") String imieWlasciciela,
                                   @RequestParam("s") int saldo,
                                   @RequestParam("n") String nrKonta, Model model)
    {
        KontoBankowe noweKonto = new KontoBankowe( (double) saldo,imieWlasciciela,nrKonta);
        kontoService.save(noweKonto);
        model.addAttribute("konto", noweKonto);
        return "kontoTemplate";
    }


    @RequestMapping("/konto")
    public String getDaneKonta(@RequestParam("nrKonta") int nrKonta, Model model)
    {
        System.out.println("Nr konta: " + nrKonta);
        if (nrKonta==1)
        {
            KontoBankowe konto = new KontoBankowe(200.00, "Michal Karolczak", "29292020");
            System.out.println(konto.toString());
            model.addAttribute("konto", konto);
            return "kontoTemplate";
        }
        else
        {
            KontoBankowe konto = new KontoBankowe(10.00, "Witek Fryc", "3535353543");
            System.out.println(konto.toString());
            model.addAttribute("konto", konto);
            return "kontoTemplate";
        }

    }


}
