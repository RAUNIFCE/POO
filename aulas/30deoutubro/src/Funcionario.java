public class Funcionario {
    String nome;
    String cpf;
    double salarioBase;
    public Funcionario(String n,String c,double s){
        this.nome=n;
        this.cpf=c;
        this.salarioBase=s;
    }
    public double getSalarioBase(){
        return this.salarioBase;

    }

    public double calcularBonificacao(){ //sobrescrevendo nas classes filhas
        return 0.0;
    }
    public void visualizarDados(){
        System.out.println("nome: "+this.nome+"\nCPF: "+this.cpf+"Salario: "+this.salarioBase);
    }
}
