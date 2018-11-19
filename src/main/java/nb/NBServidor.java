package nb;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NBServidor
{
    // Este é um entry-point de uma aplicação Spring
    public static void main(String[] args)
    {
        SpringApplication.run(NBServidor.class, args);
    }
}