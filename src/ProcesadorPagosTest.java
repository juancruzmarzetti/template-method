import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorPagosTest {
    @Test
    public void testProcesarPagoDebito(){
        Tarjeta tarjeta = new TarjetaDebito(123456, LocalDate.of(2030, 7,16), 250, 50.00);
        ProcesadorPagos procesador = new ProcesadorDebito();

        boolean respuesta = procesador.procesarPago(tarjeta, 20.00);
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void testProcesadorPagoCredito(){
        Tarjeta tarjeta = new TarjetaCredito(12345678, LocalDate.of(2030, 7,16), 300, 50.00, 20.00);
        ProcesadorPagos procesadorCredito = new ProcesadorCredito();
        boolean respuesta = procesadorCredito.procesarPago(tarjeta, 25.00);
        Assertions.assertTrue(respuesta);
    }
}