public class Retângulo {
    int altura;
    int largura;
    public void área(){
        int area=this.altura*this.largura;
        System.out.println("A área é "+area);
    }
    public void Perímetro(){
        int perimetro=(this.altura*2)+(this.largura*2);
        System.out.println("O perimetro é "+perimetro);
    }

}
