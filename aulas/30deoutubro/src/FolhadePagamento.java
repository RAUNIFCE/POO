import java.util.ArrayList;

public class FolhadePagamento {
    public void GerarFolhadePagamento(ArrayList<Funcionario> funci){
        System.out.println("****folha de pagamento");
        for(Funcionario f:funci){
            f.visualizarDados();
            double bonus=f.calcularBonificacao();
            System.out.println("Salario Final(base +bonus): "+bonus);
            System.out.println("---------------------------");
        }

    }
}
