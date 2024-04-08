public abstract class Funcionario extends Pessoa{
    private Hotel hotel;
    private double salario;
    public void getBonificacao(){}
    public Funcionario(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public abstract boolean autentica(int senha) throws SenhaIncorretaException;
}
