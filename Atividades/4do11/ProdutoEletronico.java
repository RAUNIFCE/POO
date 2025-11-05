public class ProdutoEletronico extends Produto{
    String modelo;
    int garantiaMeses;
    public ProdutoEletronico(int c,String n,double p,String m,int g){
        super(c,n,p);
        this.modelo=m;
        this.garantiaMeses=g;
    }
    @Override
    public double calcularPrecoVenda(){
        return this.getPrecoCusto()*1.5;
    }
}
