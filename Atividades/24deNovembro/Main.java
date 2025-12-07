public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Carro c=new Carro("hgjaio678","Fiat","Uno",50.00);
        c.exibirFichaTecnica();
        c.precisaDeManutencao(10001);
        c.calcularcusto(10);
        Moto y= new Moto("124futr","Yamaha","peru",30.00);
        y.exibirFichaTecnica();
        y.precisaDeManutencao(5001);
        y.calcularcusto(10);
        Caminhao s=new Caminhao("hgja45g78","Scania","113",200.00);
        s.exibirFichaTecnica();
        s.precisaDeManutencao(19999);
        s.precisaDeManutencao(20001);
        s.calcularcusto(20);

    }
}