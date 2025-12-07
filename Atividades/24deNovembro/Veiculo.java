public abstract class Veiculo {
    String placa;
    String marca;
    String modelo;
    double ValorDiaria;
    public Veiculo(String p,String ma,String mo,double v){
        this.placa=p;
        this.modelo=mo;
        this.marca=ma;
        this.ValorDiaria=v;
    }
    public void exibirFichaTecnica(){
        System.out.println("placa: "+this.placa+"\nmarca: "+this.marca+"\nmodelo: "+this.modelo+"\nValor da diária: "+this.ValorDiaria);
    }
    public abstract void precisaDeManutencao(int kmRodados);
    public void calcularcusto(int dias){
        System.out.println(dias*this.ValorDiaria);
    }
}
