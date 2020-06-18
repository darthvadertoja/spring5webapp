package guru.springframework.spring5webapp.domain;

import org.springframework.stereotype.Component;

@Component
public class User
{
    String name;
    String email;
    String password;

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
