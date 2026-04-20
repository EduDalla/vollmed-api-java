package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String raiz() {
        return "API Voll.med online. Use /hello, /medicos ou /pacientes.";
    }

    @GetMapping("/hello")
    public String olaMundo() {
        return "Hello World Spring!";
    }
}
