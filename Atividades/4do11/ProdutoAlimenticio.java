public class ProdutoAlimenticio extends Produto{
    String dataValidade;
    double pesoGramas;
    public ProdutoAlimenticio(int c,String n,double p,String dtv,double pg){
        super(c,n,p);
        this.dataValidade=dtv;
        this.pesoGramas=pg;
    }
    @Override
    public double calcularPrecoVenda(){
        return this.getPrecoCusto()*1.25;
    }
}
