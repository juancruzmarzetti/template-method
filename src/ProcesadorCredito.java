public class ProcesadorCredito extends ProcesadorPagos{
    @Override
    protected boolean checkTarjeta(Tarjeta tarjeta, Double monto) {
        TarjetaCredito credito = (TarjetaCredito) tarjeta;
        boolean respuesta = true;
        Double limite = credito.getLimite();
        Double saldoUtilizado = credito.getSaldoUtilizado();
        Double capacidadDeGasto = limite - saldoUtilizado;

        if(monto <= capacidadDeGasto){
            System.out.println("Pago procesado con éxito!");
            credito.setSaldoUtilizado(saldoUtilizado + monto);
            System.out.println("Saldo utilizado hasta el momento en el total de su tarjeta: "
                    + (saldoUtilizado + monto)
            );
            return respuesta;
        }else{
            System.out.println("Monto insuficiente.");
            respuesta = false;
            return respuesta;
        }
    }
}
