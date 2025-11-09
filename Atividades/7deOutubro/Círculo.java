import java.util.Scanner;

public class Círculo {
    double r;
    double pi=3.14;
    public void area(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o raio ");
        this.r=ent.nextDouble();
        double area=this.r*this.r*this.pi;
        System.out.println("\nÁrea do círculo "+area);
    }
    public void perimetro(){
        double perimetro=this.r*2*this.pi;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o raio ");
        this.r=ent.nextDouble();
        System.out.printf("perimetro do circulo %.2f",perimetro);
    }

}
