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

        //Questao 2
        /*
        ArrayList<Cliente> c=new ArrayList<>();
        Cliente w=new Cliente("wellington",500.00);
        c.add(w);
        Cliente y=new Cliente("yarla",4060.00);
        c.add(y);
        Banco BB= new Banco("Banco do Brasil",c);
        BB.visualizarClientes();
        Banco Inter= new Banco("Inter");
        Inter.addcliente("josé",4678.00);
        Inter.visualizarClientes();
        */

        //Questao 3 
        /* podemos alimentar o array lsit fora da loja virtual
        ArrayList<Produto> p=new ArrayList <>();
        Produto x=new Produto("Garrfa",55.0,10);
        p.add(x);
        */
        /*
        ArrayList<Produto> p=new ArrayList <>();
        LojaVirtual lv= new LojaVirtual("Shopee",p);// em vez de p posso passar new ArrayList<Produto>()
        lv.cadastrarProduto("Garrafa",55.0,10);//cadastra produto por dentro
        Produto x= new Produto("Fone",25.0,5);//cadastra produto fora de loja virtual
        lv.cadastrarProduto(x);//e adiciona na loja virtual
        lv.visualizarEstoque();
        Produto a=new Produto("Garrafa",55.0,6);
        lv.adicionarCarrinho(a);
        lv.visualizarEstoque();
        lv.excluirProdutoEstoque("Fone");
        lv.visualizarEstoque();
         */
        //Questao 4
        ArrayList<Contato> ctt=new ArrayList<>();
        Contato r= new Contato("Ruan",889999655);
        ctt.add(r);
        Contato m= new Contato("Marcelo",889400289);
        ctt.add(m);
        Agenda ag= new Agenda("Ruan",ctt);
        Agenda segunda= new Agenda("emily");
        segunda.addcontatos("Davi",8899405);
        segunda.addcontatos("Carlos",889765);
        segunda.addcontatos("Jonas",00001);

        ag.visualizarContatos();
        segunda.visualizarContatos();
        segunda.editarContato("Carlos","CH");
        segunda.visualizarContatos();
        segunda.removerContato("Jonas");
        segunda.visualizarContatos();


    }
}
