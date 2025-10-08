public class ContaBancária {
    int numero;
    String titular;
    double saldo=0;
    public void exibirInfo(){
        System.out.println("Informações da conta");
        System.out.println("numero: "+this.numero);
        System.out.println("Titular: "+this.titular);//na classe cliente
        System.out.println("saldo: "+this.saldo);


    }
    public void depositar(double valor){
        this.saldo=this.saldo+valor;
        System.out.println("deu certo!");
    }
    public void sacar(double valor){
        if(valor<=this.saldo){
            this.saldo=this.saldo-valor;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void visualizarSaldo(){
        System.out.println(this.titular+" Seu saldo é "+this.saldo);
    }
}
