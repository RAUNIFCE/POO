public class Carro {
    String marca;
    String modelo;
    float velocidade=0;
    public Carro(String s,String m){
        this.marca=s;
        this.modelo=m;
    }
    public void acelerar(float v){
        this.velocidade=v;
    }
    public void frear(){
        this.velocidade=0;
    }
    public void exibirveloatual(){
        System.out.println(this.velocidade);
    }
}
