import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Questao 1
        Pessoa p1=new Pessoa();
        Pessoa p2=new Pessoa("Ruan",19,"Atendente");
        Pessoa p3=new Pessoa("kiko",10);
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
        */

        //Questao 3 
        /* podemos alimentar o array lsit fora da loja virtual
        ArrayList<Produto> p=new ArrayList <>();
        Produto x=new Produto("Garrfa",55.0,10);
        p.add(x);
        */
        ArrayList<Produto> p=new ArrayList <>();
        LojaVirtual lv= new LojaVirtual("Shopee",p);// em vez de p posso passar new ArrayList<Produto>()
        lv.cadastrarProduto("Garrafa",55.0,10);
        Produto x= new Produto("Fone",25.0,5);
        lv.cadastrarProduto(x);
        lv.visualizarEstoque();

    }
}
