
public class Main {
    public static void main(String[] args) {
        //Exceções obrigatorias de tratamento runtime sao exceções que nao sao obrigatorias
        Conta c1=new Conta();
        try{
            c1.depositar(-20);//denytro do try catch ele continua o fluxo,fora ele para
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }

        /*c1.setSaldo(500);
        try {
            c1.sacar(550);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

         */
    }
}