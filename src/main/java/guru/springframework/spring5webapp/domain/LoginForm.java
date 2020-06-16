package guru.springframework.spring5webapp.domain;

import org.springframework.stereotype.Component;

@Component
public class LoginForm
{
    String username;
    String password;
    int logonAttempts=0;

    public int getLogonAttempts()
    {
        return logonAttempts;
    }

    public void setLogonAttempts(int logonAttempts)
    {
        this.logonAttempts = logonAttempts;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
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
