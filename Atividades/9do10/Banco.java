import java.util.ArrayList;

public class Banco {
    String nomeDaInstituicao;
    ArrayList<Cliente> Clientes;
    public Banco(String n){
        this.nomeDaInstituicao=n;
        this.Clientes=new ArrayList<>();
    }
    public Banco(String n, ArrayList<Cliente> c){
        this.nomeDaInstituicao=n;
        this.Clientes=c;
    }
    public void addcliente(String n,double s){
        Cliente x=new Cliente(n,s);
        this.Clientes.add(x);

    }
    public void visualizarClientes(){
        System.out.println("Banco:"+this.nomeDaInstituicao);
        for(Cliente c: this.Clientes){
            System.out.println("Nome: "+c.nome+"\nSaldo: "+c.saldo);
        }
    }
}
