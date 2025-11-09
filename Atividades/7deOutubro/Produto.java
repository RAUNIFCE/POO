import java.util.ArrayList;
public class Produto{
    String nome;
    double valor;
    int qtde;
    public Produto(String n,double v,int q){
        this.nome=n;
        this.valor=v;
        this.qtde=q;
    }
    public void valorestoque(){
        System.out.println(this.qtde*this.valor);
    }
    public void temproduto(){
        if(this.qtde>0){
            System.out.println("tem no estoque");
        }else{
            System.out.println("não tem no estoque");
        }
    }
}