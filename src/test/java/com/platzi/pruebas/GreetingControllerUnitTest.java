package com.platzi.pruebas;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GreetingControllerUnitTest {

    private GreetingController greetingController;
    private GreetingService greetingService;

    /**
     * @Before : Crea los objetos iniciales para las pruebas.
     */
    @Before
    public void setUp() {
        // mock(): Crea un objeto simulado.
        greetingService = mock(GreetingService.class);
        // Se envia el objeto al constructor para crear el controlador.
        greetingController = new GreetingController(greetingService);
    }

    /**
     * El método debería retornar el valor del serviio con código de estado 200.
     */
    @Test
    public void itShouldReturnTheServiceValueWith200StatusCode() {
        // when(): Crea un comportamiento en el objeto simulado.
        // El comportamiento que hará es que el método retorne un string específico. Si no se hace el valor por defecto será null.
        when(greetingService.helloWorld()).thenReturn("Saludos");

        // El httpResponse viene con 3 objetos privados por defecto. El status (200), el body ("Saludos") y los headers (size=0).
        ResponseEntity httpResponse = greetingController.sayHelloWorld();

        assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
        assertEquals("Saludos", httpResponse.getBody());
    }

}
