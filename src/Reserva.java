public class Reserva {
    private SistemaPagamento formaPagamento = new SistemaPagamento();
    private Cliente cliente = new Cliente();
    private Funcionario funcionario = new Funcionario();
    private Quarto quarto = new Quarto();
    private double valor;


    public Reserva() {
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
