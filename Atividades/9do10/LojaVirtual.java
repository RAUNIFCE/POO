import java.util.ArrayList;
public class LojaVirtual{
    String nome;
    double frete;
    ArrayList<Produto> estoque;
    ArrayList<Produto> carrinho=new ArrayList<>();
    public LojaVirtual(String nome, ArrayList<Produto> p){
        this.nome=nome;
        this.estoque=p;
        this.frete=15;
        
    }
    public LojaVirtual(String nome,double f, ArrayList<Produto> p){
        this.nome=nome;
        this.estoque=p;
        this.frete=f;
        
    }
    public void cadastrarProduto(String nome,double v,int q){
        Produto p = new Produto(nome,v,q);
        this.estoque.add(p);
        System.out.println("Produto cadastrado");
    }
    public void cadastrarProduto(Produto p){
        
        this.estoque.add(p);
        System.out.println("Produto cadastrado");
    }
    public void visualizarEstoque(){
        for(Produto p: this.estoque){
            System.out.println("Nome: "+p.nome+"- Quantidade"+p.qtde);
        }
    }
    public void atualizarEstoque(int valor,String nome){
        for(Produto p: this.estoque){
           if(p.nome==nome){
               p.qtde=p.qtde-valor;
               System.out.println("Estoque atualizado");
               break;
           }else{
               System.out.println("Produto não localizado");
           }
        }
    }
    public void adicionarCarrinho(Produto p){
        this.carrinho.add(p);
        atualizarEstoque(p.qtde,p.nome);
               System.out.println("Produto adicionado ao carrinho");
    }
    public void excluirProdutoEstoque(String nome){
        for(Produto p:this.estoque){
            if(p.nome.equals(nome)){
                this.estoque.remove(p);
               System.out.println("Produto excluido");
               break;
            }
        }
    }
}