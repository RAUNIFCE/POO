import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    double[]  nota=new double[2];
    public void media(){

        Double media=(this.nota[0]+this.nota[1])/2;
        System.out.println("A média é "+media);
    }
    public void SAluno(){
        Double media=(this.nota[0]+this.nota[1])/2;
        if(media>=7){
            System.out.println("Escapou");
        }else{
            System.out.println("Reprovado");
        }
    }
}
