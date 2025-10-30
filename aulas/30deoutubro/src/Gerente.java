public class Gerente extends Funcionario{
    String senha;
    int numfuncGerenciado;

    public Gerente(String n,String c,double s,int qtde){
        super(n,c,s);//super ele aplica os dados chamados para a superclasse classepai obrigatorio,aqui usa o super como se chamasse o construtor de funcionario.
        this.numfuncGerenciado=qtde;
    }
    @Override //sobrescrevendo o metodo
    public double calcularBonificacao(){
        double bonus=this.getSalarioBase()*1.15;
        return bonus+1000;
    }

}
