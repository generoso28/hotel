public interface Pagamento {
    void pagar(SistemaPagamento formaPagamento);

    public void cancelar();
}
