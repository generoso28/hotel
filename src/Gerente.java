public class Gerente extends Funcionario {
    int senha;

    public Gerente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

}
