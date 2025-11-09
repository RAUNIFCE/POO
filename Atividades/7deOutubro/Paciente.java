import java.util.ArrayList;

public class Paciente {
    String nome;
    int idade;
    ArrayList<String> consultas=new ArrayList<>();
    public  Paciente(String nome,int i){
        this.nome=nome;
        this.idade=i;
    }
    public void addconsulta(String s){
        this.consultas.add(s);
    }
    public void exibircons(){
        for(String c:this.consultas){
            System.out.println(c);
        }
    }

}
