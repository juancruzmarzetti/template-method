import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta{

    private Double saldoDisponible;

    public TarjetaDebito(Integer numeracion, LocalDate fechaExpiracion, Integer codigo, Double saldoDisponible) {
        super(numeracion, fechaExpiracion, codigo);
        this.saldoDisponible = saldoDisponible;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
