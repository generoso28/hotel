public class Quarto {
    private int numero;
    private TipoQuarto tipo;
    private boolean isOcupado;
    private Hotel hotel;
    public Quarto(int numero, TipoQuarto tipo, boolean isOcupado, Hotel hotel) {
        this.numero = numero;
        this.tipo = tipo;
        this.isOcupado = isOcupado;
        this.hotel = hotel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return isOcupado;
    }

    public void setOcupado(boolean ocupado) {
        isOcupado = ocupado;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
