public class funcionario {
    public String nome;
    String departamento;
    protected double salario;
    private String senha;

    public void setSenha(String s){
       boolean resp=validarsenha(s);
       if(resp==true){
           this.senha=s;
           System.out.println("tudo certo");
       }
       else{
           System.out.println("tudo errado");
       }
    }
    private boolean validarsenha(String s){
        if(s.length()<8){
            return false;
        }else{
            return true;
        }
    }
    public void mostrarInformacoes(){
        System.out.println("nome:"+this.nome+"\ndepartamento"+this.departamento
        );
    }
}
