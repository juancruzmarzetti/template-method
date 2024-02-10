import java.time.LocalDate;

public abstract class Tarjeta {
    private Integer numeracion;
    private LocalDate fechaExpiracion;
    private Integer codigo;

    public Tarjeta(Integer numeracion, LocalDate fechaExpiracion, Integer codigo) {
        this.numeracion = numeracion;
        this.fechaExpiracion = fechaExpiracion;
        this.codigo = codigo;
    }

    public Integer getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(Integer numeracion) {
        this.numeracion = numeracion;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
