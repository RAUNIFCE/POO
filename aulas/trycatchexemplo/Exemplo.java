public class Exemplo {
    int idade;
    public int divisao(int num1,int num2){
        try{
        int resultado = num1/num2;
        return resultado;
    }catch (ArithmeticException e){
            System.out.println("Erro na divisão: "+e.getMessage());
        }
        return 0;
    }
    public void setIdade(int n){
        if(n<0){
            throw new IllegalArgumentException("Valor inválido,informe outro maior que 0");
        }
        this.idade=n;
    }
}
