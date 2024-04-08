import java.util.Scanner;

public class Reserva implements Pagamento {
    private SistemaPagamento formaPagamento;
    private Cliente cliente;
    private Funcionario funcionario;
    private Quarto quarto;
    private double valor;

    public Reserva(SistemaPagamento formaPagamento, Cliente cliente, Funcionario funcionario, Quarto quarto, double valor) {
        pagar(formaPagamento);
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.quarto = quarto;
        this.valor = valor;
    }
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


    @Override
    public void pagar(SistemaPagamento formaPagamento) {
        System.out.println("A forma de pagamento será: " + formaPagamento.getMetodoPagamento() + "? S/N");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        if (resposta.equals("S") || resposta.equals("s")) {
            System.out.println("Pagamento efetuado com sucesso!");
            this.formaPagamento = formaPagamento;
        } else {
            cancelar();
        }

    }

    @Override
    public void cancelar() {
        System.out.println("Pagamento cancelado!");
        System.out.println("Deseja alterar a forma de pagamento? S/N");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        if (resposta.equals("S") || resposta.equals("s")) {
            System.out.println("Digite a nova forma de pagamento: ");
            String novoMetodoPagamento = scanner.nextLine();
            SistemaPagamento novoSistemaPagamento = new SistemaPagamento(novoMetodoPagamento);
            pagar(novoSistemaPagamento);
        }
    }
}
