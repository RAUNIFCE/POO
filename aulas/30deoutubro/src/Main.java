import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //herança e polimorfismo
        Gerente g1= new Gerente("Marcos","1234456789",50000.00,3);
        Gerente g2= new Gerente("Beatriz","33224749",5000.00,2);
        Programador p1 = new Programador("Laura","12301485858",4000.0,"Java",2);
        Programador p2 = new Programador("Pedro","16976485858",4000.0,"Phyton",1);
        Programador p3 = new Programador("Vitor","1211113458",4000.0,"C",3);
        g1.visualizarDados();
        p1.visualizarDados();
        p2.visualizarDados();
        g2.visualizarDados();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(p1);
        funcionarios.add(p2);
        funcionarios.add(p3);
        funcionarios.add(g1);
        funcionarios.add(g2);
        /*
            for(Funcionario f:funcionarios){
            f.visualizarDados();
            double bonus=f.calcularBonificacao();
                System.out.println("bonus: "+bonus);
            }

         */

        /*
        ArrayList<Gerente> gerentes= new ArrayList<>();
        gerentes.add(g1);
        gerentes.add(g2);
        for(Gerente g:gerentes){
            double bonus=g.calcularBonificacao();
            g.visualizarDados();
            System.out.println("Bonus: "+bonus);
        }

         */
        FolhadePagamento fp=new FolhadePagamento();
        fp.GerarFolhadePagamento(funcionarios);



    }
}