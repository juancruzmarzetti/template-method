import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta{
    private Double limite;
    private Double saldoUtilizado;

    public TarjetaCredito(Integer numeracion, LocalDate fechaExpiracion, Integer codigo, Double limite, Double saldoUtilizado) {
        super(numeracion, fechaExpiracion, codigo);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(Double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
