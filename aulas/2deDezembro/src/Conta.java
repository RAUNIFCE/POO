public class Conta {
    private double saldo;
        public void sacar(double saque) throws SaldoInsuficienteException/*Quem for chamar é obrigado a tratar trycatchar,se ela herda de exception ela é obrigada a verificar*/{
            if(saque>this.saldo){
                String msg="O valor do saque é maior "+saque+" é maior que o valor do saldo,que é "+this.saldo;
                throw new SaldoInsuficienteException(msg,this.saldo,saque);
            }else{
                this.saldo=this.saldo-saque;
            }
        }
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public void depositar(double valor){
            if(valor<0){
                String msg="Valor inválido!Informe um valor maior que 0 ";
                throw new ValorInvalidoException(msg);
            }
        }
}
