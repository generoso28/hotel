public class Execucao {
    public static void main(String[] args) {
        //Create a new instance of Hotel
        Hotel hotel = new Hotel();
        // Set the value of the nome attribute of hotel
        hotel.setNome("5 Estrelas");
        // Set the value of the endereco attribute of hotel
        hotel.setEndereco("Rua 1");
        // Set the value of the telefone attribute of hotel
        hotel.setTelefone("123456789");
        // Set the value of the email attribute of hotel
        hotel.setEmail("hotel5estrelas@gmail.com");
        // Set the value of the cnpj attribute of hotel
        hotel.setCnpj("123456789");
        // Set the value of the quantidadeQuartos attribute of hotel
        hotel.setQuantidadeQuartos(10);
        // Create a new instance of TipoQuarto

        TipoQuarto tipoQuarto = new TipoQuarto();
        // Set the value of the tipoQuarto attribute of tipoQuarto
        tipoQuarto.setTipoQuarto("Luxo");
        // Set the value of the tarifa attribute of tipoQuarto
        tipoQuarto.setTarifa(100.0);
        // Create a new instance of Cliente

        Cliente cliente = new Cliente();
        // Set the value of the nome attribute of cliente
        cliente.setNome("João");
        // Set the value of the telefone attribute of cliente
        cliente.setTelefone("123456789");
        // Set the value of the email attribute of cliente
        cliente.setEmail("joao@gmail.com");
        // Set the value of the cpf attribute of cliente
        cliente.setCpf("123456789");
        // Set the value of the quantidadeReservas attribute of cliente
        cliente.setQuantidadeReservas(0);
        // Create a new instance of Funcionario

        Funcionario funcionario = new Funcionario();
        // Set the value of the nome attribute of funcionario
        funcionario.setNome("Maria");
        // Set the value of the cpf attribute of funcionario
        funcionario.setCpf("987654321");
        // Set the value of the email attribute of funcionario
        funcionario.setEmail("maria@gmail.com");
        // Set the value of the telefone attribute of funcionario
        funcionario.setTelefone("987654321");
        // Set the value of the funcao attribute of funcionario
        funcionario.setFuncao("Recepcionista");
        // Create a new instance of Quarto

        Quarto quarto = new Quarto();
        // Set the value of the tipo attribute of quarto
        quarto.setTipo(tipoQuarto);
        // Set the value of the numero attribute of quarto
        quarto.setNumero(352);
        // Create a new instance of Reserva

        Reserva reserva = new Reserva(100.0, 5);
        // Set the value of the formaPagamento attribute of reserva
        reserva.setFormaPagamento(new SistemaPagamento());
        // Set the value of the cliente attribute of reserva
        reserva.setCliente(cliente);
        // Set the value of the funcionario attribute of reserva
        reserva.setFuncionario(funcionario);
        // Set the value of the quarto attribute of reserva
        reserva.setQuarto(quarto);
        // Set the value of the valor attribute of reserva
        //reserva.setValor(100.0);
        // Set the value of the hotel attribute of quarto
        quarto.setHotel(hotel);
        //print all content in object reserva

        System.out.println("----------------------------------------------------");
        System.out.println("\nDados da reserva: ");
        System.out.println("Reserva número: "+reserva.getIdReserva());
        System.out.println("Forma de pagamento: "+reserva.getFormaPagamento());
        System.out.println("Cliente: "+reserva.getCliente().getNome());
        System.out.println("Funcionário: "+reserva.getFuncionario().getNome());
        System.out.println("Quanto nº: "+reserva.getQuarto().getNumero());
        System.out.println("Valor: "+reserva.getValorDiaria());
        System.out.println("Classificação: "+reserva.getQuarto().getHotel().getNome());
        System.out.println("Valor total da reserva: "+reserva.ValorReserva(reserva.getValorDiaria(), reserva.getQtdDias()));
    }

}
