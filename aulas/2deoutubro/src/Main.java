//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Carro c1= new Carro();//cria variavel tipo carro, o new é usado pra criar objetos
        c1.cor="azul";
        c1.ano=2025;
        c1.quilometragem=5;
        c1.chassi="AFGG678";
        //c1.acelerar();
        //c1.frear();
        c1.exibirInfo();

        Carro c2= new Carro();
        c2.cor="cinza";
        c2.ano=2021;
        c2.quilometragem=150;
        c2.chassi="ZSDFAFGGg";
        c2.exibirInfo();

        Carro c3= new Carro();
        c3.cor="cinza";
        c3.ano=2021;
        c3.quilometragem=150;
        c3.chassi="ZSDFAFGGg";
        c3.exibirInfo();

        if(c2==c3){//dois objetos podem ser totalmente iguais mas na memória são diferentes

            System.out.println("são iguais");
        }else{
            System.out.println("são diferentes");
            System.out.println(c2);
            System.out.println(c3);
        }

        Carro c4=c3;//c4 aponta pro mesmo local de memória que o c3, não criei um objeto pro c4 pq não tivemos o new
        */
    Conta conta = new Conta();
    conta.numero=12345;
    //Cliente cl= new Cliente();
    //cl.nome="Jamires";
    conta.titular.nome="Jamires";
    conta.depositar(500);
    conta.visualizarSaldo();
    conta.sacar(350);
    conta.visualizarSaldo();
    conta.sacar(200);
    conta.titular.exibirDados();
    Conta ruan= new Conta();
    ruan.numero=54321;
    ruan.titular.nome="Ruan";
    conta.transferir(100,ruan);
    conta.visualizarSaldo();
    ruan.visualizarSaldo();





    }




}