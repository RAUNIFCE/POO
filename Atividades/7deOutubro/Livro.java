public class Livro {
    String titulo;
    String autor;
    int pag;
    boolean disp=true;
    public Livro(String t,String a,int p){
        this.autor=a;
        this.titulo=t;
        this.pag=p;

    }
    public void empL(){
        if(this.disp==true) {
            this.disp = false;
        }else{
            System.out.println("ele não está aqui");
        }
    }
    public void devL(){
        if(this.disp==false) {
            this.disp = true;
        }else{
            System.out.println("ele já está aqui");
        }
    }
    public void disponibilidade(){
        if(this.disp==true) {
            System.out.println("disponível");
        }else{
            System.out.println("indisponíve");
        }


    }
}
