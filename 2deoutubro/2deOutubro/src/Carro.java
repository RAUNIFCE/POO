public class Carro {
    String cor;
    int ano;
    double quilometragem;
    String chassi;
    //ATRIBUTOS ACIMA

    //MÉTODOS
    public void acelerar(){
        System.out.println("Acelerando o carro");
    }
    public void frear(){
        System.out.println("freando o carro");
    }
    public void exibirInfo(){
        System.out.println("informações do carro");
        System.out.println("Cor:"+this.cor);//o this ele olha o atributo já preexistente na classe
        System.out.println("Ano:"+this.ano);
        System.out.println("quilometragem:"+this.quilometragem);
        System.out.println("Chassi:"+this.chassi);
    }

}
