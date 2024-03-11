public class TipoQuarto {
    private String tipoQuarto;
    private double tarifa;
    public TipoQuarto(String tipoQuarto, double tarifa) {
        this.tipoQuarto = tipoQuarto;
        this.tarifa = tarifa;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
