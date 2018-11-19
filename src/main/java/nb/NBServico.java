package nb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class NBServico
{
    // Identificador do serviço
    @RequestMapping("/")
    public String index()
    {
        return "NB Serviço REST";
    }

    // Serviço de echo (variável "ping")
    @RequestMapping("/echo")
    public String index(String ping)
    {
        return String.format("PONG: %s", ping);
    }

    // Serviço de echo numa path {parte} (variável "ping")
    @RequestMapping("/echo/{parte}")
    public String echo(@PathVariable String parte, String ping) {
        return String.format("PONG: [%s] %s", parte, ping);
    }
}