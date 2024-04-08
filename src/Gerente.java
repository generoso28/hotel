import java.sql.SQLOutput;

public class Gerente extends Funcionario {
    int senha;
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    @Override
    public void getBonificacao() {
        setSalario(getSalario()*0.15);
    }

    public boolean autentica(int senha) throws SenhaIncorretaException {
        if (this.senha != senha) {
            throw new SenhaIncorretaException("Acesso negado! Senha incorreta.");
        }else{
            System.out.println("Acesso permitido!");
            return true;
        }

    }
}
