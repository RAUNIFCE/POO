public class Conta {
    String titular;
    int num;
    double saldo;
    public Conta(int n,double valor){
            this.num = n;
            this.saldo = valor;
    }
    public Conta(int n){
        this.num = n;

    }
    public Conta( String titular){
        this.titular=titular;

    }
    public Conta(String titular,int n,double valor){
        this.titular=titular;
        this.num = n;
        this.saldo = valor;
    }

}
