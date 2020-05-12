package guru.springframework.spring5webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootApplication
public class Spring5webappApplication
{

	public static void main(String[] args) {SpringApplication.run(Spring5webappApplication.class,args); }

	@Test
	public void contextLoads() {
	}

}
