import java.util.ArrayList;

public class Agenda {
    String nome;
    ArrayList<Contato> contato;
    public Agenda(String n,ArrayList<Contato>c){
        this.nome=n;
        this.contato=c;

    }
    public Agenda(String n){
        this.nome=n;
        this.contato=new ArrayList<>();
    }
    public void addcontatos(String n,int num){
        Contato x=new Contato(n,num);
        this.contato.add(x);
    }
    public void editarContato(String antigo,String novo){
        int i=0;
        for(Contato c: this.contato){
            if(c.nome==antigo){
                c.nome=novo;
                System.out.println("Contato editado");
                i++;
                break;
            }
        }
        if (i==0){
            System.out.println("Contato não encontrado");
        }
    }
    public void removerContato(String nome){
        int i=0;
        for(Contato c: this.contato){
            if(c.nome==nome){
                this.contato.remove(c);
                i++;
                break;
            }
        }
        if (i==0){
            System.out.println("Contato não encontrado");
        }
    }
    public void removerContato(int num){
        int i=0;
        for(Contato c: this.contato){
            if(c.telefone==num){
                this.contato.remove(c);
                i++;
                break;
            }
        }
        if (i==0){
            System.out.println("Contato não encontrado");
        }
    }
    public void visualizarContatos(){
        System.out.println("***************");

        System.out.println("*Dono da Agenda:"+this.nome+ "  *");
        for(Contato c: this.contato){
            System.out.println("*Nome: "+c.nome+ "  *"+"\n*número: "+c.telefone+ "  *");
        }
        System.out.println("***************");
    }
}
