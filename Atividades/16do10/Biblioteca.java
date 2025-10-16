public class Biblioteca{
    String nbiblioteca;
    ArrayList<Emprestimo> emprestimo;
    ArrayList<Livro> catalogo;
    public class Biblioteca(){
        this.emprestimo=new ArrayList;
        this.livro= new ArrayList;
    }public class Biblioteca(String n,ArrayList<Emprestimo> e,ArrayList<Livro> l){
        this.nbiblioteca=n;
        this.emprestimo=e;
        this.livro=l;
    }
    public void cadastrar(String isbn,String t,String a,int qtd){
        Livro l= new Livro(isbn,t,a,qtd);
        this.catalogo.add(l);
    }
    
}