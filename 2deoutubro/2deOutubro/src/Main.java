//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro c1= new Carro();//cria variavel tipo carro, o new é usado pra criar objetos
        c1.cor="azul";
        c1.ano="2025";
        c1.quilometragem=5;
        c1.chassi="AFGG678";
        c1.acelerar();
        c1.frear();
        c1.exibirInfo();


    }
}