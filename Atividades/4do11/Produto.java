public class Produto {
    int codigo;
    String nome;
    double precoCusto;
    public Produto(int c,String n,double p){
        this.codigo=c;
        this.nome=n;
        this.precoCusto=p;
    }
    public double getPrecoCusto(){
        return precoCusto;
    }
    public double calcularPrecoVenda(){
        return 0.0;
    }
}
