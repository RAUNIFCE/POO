import java.util.ArrayList;

public class GerenciarVendas {

    public double calcularpagamento(ArrayList<Produto> p){

        double precofinal=0;
        for( Produto pr : p){
            precofinal=precofinal+pr.calcularPrecoVenda();
        }
        return precofinal;
    }
}
