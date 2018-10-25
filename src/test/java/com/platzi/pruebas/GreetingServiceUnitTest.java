package com.platzi.pruebas;

// http://junit.sourceforge.net/javadoc/org/junit/Assert.html
//import org.junit.Assert;  // Forma 2
import static org.junit.Assert.*;
import org.junit.Test;

public class GreetingServiceUnitTest {

    private GreetingService greetingService = new GreetingService();

    /**
     * @Test : Debe ser colocado en los métodos que se ejecutan pruebas.
     * El método debería decir "Hello World".
     */
    @Test
    public void itShouldSayHelloWorld() {
        // Assert.assertEquals("Hola Mundo", greetingService.helloWorld());  // Forma 2
        /*
         * assertEquals(): Verifica que ambos parámetros sean iguales (valor_esperado, valor_actual).
         * Si son diferentes, saldrá la excepción org.junit.ComparisonFailure.
         * Sale subrayado el método (IntelliJ) si la prueba no fue exitosa.
         */
        assertEquals("Hola Mundo", this.greetingService.helloWorld());
    }
}
