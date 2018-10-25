package com.platzi.pruebas;

import org.springframework.stereotype.Component;

/**
 * @Component : (Componente Genérico) Define un bean. Este será instanciado y manejado por el contenedor DI de Spring.
 */
@Component
public class GreetingService {

    public String helloWorld() {
        return "Hola Mundo";
    }
}
