//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro lA= new Livro( "A Arte da Guerra",false);
        Livro lB= new Livro( "1984",true);
        Livro lC= new Livro( null,false);
        Biblioteca bb=new Biblioteca();
        //bb.emprestarLivro(lB); essa brincadeira ele não deixa,tem que trycatchar
        try {
            bb.emprestarLivro(lB);
            bb.emprestarLivro(lC);
        } catch (LivroNaoDisponivelException e) {
            System.out.println(e.getMessage());
        }
        

    }
}