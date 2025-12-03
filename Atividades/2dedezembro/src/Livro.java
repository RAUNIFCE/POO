public class Livro {
    String titulo;
    boolean isEmprestado;
    public Livro(String t,boolean e){
        this.titulo=t;
        this.isEmprestado=e;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEmprestado(boolean emprestado) {
        this.isEmprestado = emprestado;
    }
    public void getemprestado() {
        if(this.isEmprestado){
            System.out.println("emprestado");
        }
        else{
            System.out.println("Livre");
        }
    }
}
