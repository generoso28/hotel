public class Atendente extends Funcionario {

    public Atendente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }

    @Override
    public void getBonificacao() {
        setSalario(getSalario()*0.1);
    }
}
