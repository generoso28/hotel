public class Reserva {
    private SistemaPagamento formaPagamento = new SistemaPagamento();
    private Cliente cliente = new Cliente();
    private Funcionario funcionario = new Funcionario();
    private Quarto quarto = new Quarto();
    private int idReserva, totalReservas;
    private double valorDiaria, valorTotal;

    private int qtdDias;


    public Reserva(double valorDiaria, int qtdDias) {
        System.out.println("Instanciando uma reserva!");
        totalReservas++;
        idReserva = totalReservas;
        this.valorDiaria = valorDiaria;
        this.qtdDias = qtdDias;
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
        valorDiaria = this.quarto.getTipo().getTarifa();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valor) {
        this.valorDiaria = valor;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public double ValorReserva(double valorDiaria, int qtdDias){
        this.valorTotal = this.valorDiaria * this.qtdDias;
        return valorTotal;
    }
}



