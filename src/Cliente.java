public class Cliente extends Pessoa{

    private int quantidadeReservas;

    public Cliente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    public int getQuantidadeReservas() {
        return quantidadeReservas;
    }

    public void setQuantidadeReservas(int quantidadeReservas) {
        this.quantidadeReservas = quantidadeReservas;
    }
}
