public class Biblioteca {
    public void emprestarLivro(Livro livro) throws LivroNaoDisponivelException{
        if(livro.isEmprestado==true){
            String msg="Já foi emprestado";
            throw new LivroNaoDisponivelException(msg);
        } else if (livro.titulo==null) {
            String msg="Livro com informações inválidas ";
            throw new DadosInvalidosException(msg);
        } else{
            livro.isEmprestado=true;
            System.out.println(" tudo ok ");
        }
    }
}
