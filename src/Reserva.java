public class Reserva {
    private SistemaPagamento formaPagamento;
    private Cliente cliente;
    private Funcionario funcionario;
    private Quarto quarto;
    private double valor;

    public Reserva(SistemaPagamento formaPagamento, Cliente cliente, Funcionario funcionario, Quarto quarto, double valor) {
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.quarto = quarto;
        this.valor = valor;
    }

    public SistemaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(SistemaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
        valor = this.quarto.getTipo().getTarifa();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
