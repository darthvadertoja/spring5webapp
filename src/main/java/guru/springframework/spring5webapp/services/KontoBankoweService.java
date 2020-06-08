package guru.springframework.spring5webapp.services;

import guru.springframework.spring5webapp.domain.KontoBankowe;
import guru.springframework.spring5webapp.repositories.KontoBankoweRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KontoBankoweService
{
    @Autowired
    private KontoBankoweRepository kontoBankoweRepository;

    public void save(KontoBankowe kontoBankowe)
    {
        kontoBankoweRepository.save(kontoBankowe);
    }

    public List<KontoBankowe> listAll()
    {

        return (List<KontoBankowe>) kontoBankoweRepository.findAll();
    }

}
