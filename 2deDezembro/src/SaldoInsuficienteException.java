public class SaldoInsuficienteException extends Exception{
    private double saldoAtual;
    private double ValorSaque;
    public SaldoInsuficienteException(String msg,double sa,double vs){
        super(msg);
        this.saldoAtual=sa;
        this.ValorSaque=vs;
    }
    public double getSaldoAtual() {
        return saldoAtual;
    }
    public double getValorSaque() {
        return ValorSaque;
    }

}
