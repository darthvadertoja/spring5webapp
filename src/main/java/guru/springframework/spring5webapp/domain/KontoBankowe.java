package guru.springframework.spring5webapp.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KontoBankowe
{
    private Long id;
    double saldo;
    String nazwaWlasciciela;
    String nrKonta;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "KontoBankowe{" +
                "saldo=" + saldo +
                ", nazwaWlasciciela='" + nazwaWlasciciela + '\'' +
                ", nrKonta='" + nrKonta + '\'' +
                '}';
    }

    public KontoBankowe()
    {

    }

    public KontoBankowe(double saldo, String nazwaWlasciciela, String nrKonta)
    {
        this.saldo = saldo;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.nrKonta = nrKonta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public String getNazwaWlasciciela()
    {
        return nazwaWlasciciela;
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela)
    {
        this.nazwaWlasciciela = nazwaWlasciciela;
    }

    public String getNrKonta()
    {
        return nrKonta;
    }

    public void setNrKonta(String nrKonta)
    {
        this.nrKonta = nrKonta;
    }
}
