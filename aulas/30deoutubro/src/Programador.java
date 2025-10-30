public class Programador extends Funcionario{
    String linguagemPrincipal;
    int projetosconcluidos;
    public Programador(String n,String c,double s,String lp,int p){
        super(n,c,s);
        this.linguagemPrincipal=lp;
        this.projetosconcluidos=p;

    }
    @Override //sobrescrevendo o metodo
    public double calcularBonificacao(){
        double bonus=this.getSalarioBase()*1.1;
        double valor=this.projetosconcluidos*500;
        return bonus+valor;
    }



}
