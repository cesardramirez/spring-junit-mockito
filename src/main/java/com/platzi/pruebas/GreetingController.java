package com.platzi.pruebas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Controller : (Componente de Presentación) Se define los endpoint (solicitud de una ruta).
 */
@Controller
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public ResponseEntity sayHelloWorld() {
        // Inyecta un servicio y retorna el string con el status 200.
        return ResponseEntity.ok(this.greetingService.helloWorld());
    }
}
