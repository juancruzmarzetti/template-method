public class ProcesadorDebito extends ProcesadorPagos{

    @Override
    protected boolean checkTarjeta(Tarjeta tarjeta, Double monto) {
        TarjetaDebito debito = (TarjetaDebito) tarjeta;
        Double saldoTarjeta = debito.getSaldoDisponible();
        boolean respuesta = true;
        if(saldoTarjeta >= monto){
            Double saldoDisponibleActualizado = saldoTarjeta - monto;
            debito.setSaldoDisponible(saldoDisponibleActualizado);
            System.out.println("Pago procesado con éxito! Saldo actualizado disponible: " + saldoDisponibleActualizado);
            return respuesta;
        }else{
            System.out.println("El saldo de la tarjeta no es suficiente!");
            respuesta = false;
            return respuesta;
        }
    }
}
