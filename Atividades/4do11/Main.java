import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Produto> p= new ArrayList<>();
        ProdutoAlimenticio pa1= new ProdutoAlimenticio(1,"Arroz",5.00,"04/11/2025",1000.0);
        ProdutoEletronico pe1= new ProdutoEletronico(2,"Celular",1000.00,"m21s",12);
        p.add(pa1);
        p.add(pe1);
        GerenciarVendas gv= new GerenciarVendas();
        System.out.println(gv.calcularpagamento(p));


    }
}