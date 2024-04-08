public class Execucao {
    public static void MostrarReserva(Reserva reserva) {
        System.out.println("Método de pagamento: " + reserva.getFormaPagamento().getMetodoPagamento());
        System.out.println("Cliente: " + reserva.getCliente().getNome());
        System.out.println("Funcionário" + reserva.getFuncionario().getNome());
        System.out.println("Número do quarto: " + reserva.getQuarto().getNumero());
        System.out.println("Valor: R$" + reserva.getValor());
        System.out.println("Nome do Hotel: " + reserva.getQuarto().getHotel().getNome());
    }
    public static int Menu() {
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Funcionário");
        System.out.println("3 - Cadastrar Hotel");
        System.out.println("4 - Cadastrar Quarto");
        System.out.println("5 - Cadastrar Tipo de Quarto");
        System.out.println("6 - Realizar Reserva");
        System.out.println("7 - Cancelar Reserva");
        System.out.println("8 - Sair");
        return 0;
    }
    public static void main(String[] args) {
        //Menu();

        Hotel hotel = new Hotel("5 Estrelas", "Rua 1", "123456789", "hotel5estrelas@gmail.com", "123456789", 10);
        TipoQuarto tipoQuarto = new TipoQuarto("Luxo", 100.0);
        Cliente cliente = new Cliente("Fabrício", "123456789", "anacleto741@gmail.com", "123456789");
        cliente.setQuantidadeReservas(0);
        Quarto quarto = new Quarto(145, tipoQuarto, false, hotel);
        Gerente gerente = new Gerente("Lucas", "11884049621", "lucas.caixeta10@gmail.com", "35984124698");
        Reserva reserva = new Reserva(new SistemaPagamento("Crédito"), cliente, gerente, quarto, 100.0);
        MostrarReserva(reserva);
        gerente.getBonificacao();
        gerente.setSenha(456);
        try {
            gerente.autentica(123);
        } catch (SenhaIncorretaException e) {
            e.printStackTrace();
        }
    }

}
