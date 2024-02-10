import java.time.LocalDate;

public abstract class ProcesadorPagos {
    public boolean procesarPago(Tarjeta tarjeta, Double monto){
        boolean respuesta = false;
        LocalDate fechaExpiracionTarjeta = tarjeta.getFechaExpiracion();
        LocalDate fechaActual = LocalDate.now();
        if (fechaExpiracionTarjeta.isBefore(fechaActual)) {
            return respuesta;
        }else if (fechaExpiracionTarjeta.isAfter(fechaActual)) {
            return checkTarjeta(tarjeta, monto);
        }
        return respuesta;
    };
    protected abstract boolean checkTarjeta(Tarjeta tarjeta, Double monto);
}
