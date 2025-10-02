public class Conta {
    int numero;
    Cliente titular=new Cliente();/*ou Cliente titular */ //Composição atributo do tipo de uma classe
    double saldo=0;
    double limite=0;

    public void exibirInfo(){
        System.out.println("Informações da conta");
        System.out.println("numero: "+this.numero);
        System.out.println("Titular: "+this.titular.nome);//na classe cliente
        System.out.println("saldo: "+this.saldo);
        System.out.println("limite"+this.limite);

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
        System.out.println(this.titular.nome+" Seu saldo é "+this.saldo);
    }
    public void transferir(double valor,Conta c){
        if(valor<=this.saldo){
            this.saldo=this.saldo-valor;
            c.saldo=c.saldo+valor;
            System.out.println("Transferencia realizada com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
}
