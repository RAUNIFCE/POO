public class Funcionario {
    String nome;
    double salario;
    String cargo;
    public Funcionario(String n,double s,String c){
        this.nome=n;
        this.salario=s;
        this.cargo=c;
    }
    public void calcularsalarioliquido(double imposto){
        System.out.println(this.salario*(1-imposto));
    }
}
