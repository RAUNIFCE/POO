public class Pessoa {
    String nome;
    int idade;
    String profissao;
        public Pessoa(){
        this.idade=0;
        this.nome="";
        this.profissao="";
        }
        public Pessoa(String nome,int idade,String profissao){
            this.idade=idade;
            this.nome=nome;
            this.profissao=profissao;
        }
        public Pessoa(String nome,int idade){
            this.idade=idade;
            this.nome=nome;
            this.profissao=" não informada";

        }
        public void exibirInformacoes(){
            System.out.println("Nome:"+this.nome);
            System.out.println("Idade:"+this.idade);
            System.out.println("Profissão:"+this.profissao);
        }
}
