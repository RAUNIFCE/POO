import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
/*
            int []numerador={10,5,20,18,8};
            int []denominador={2,0,5,1};
            for (int i=0;i<5;i++){
                try{
                System.out.println(numerador[i]+"/"+denominador[i]+"="+numerador[i]/denominador[i]);
                }catch(ArithmeticException e){
                    System.out.println("Erro na divisão: "+e.getMessage());
                }catch (ArrayIndexOutOfBoundsException aiobe){
                    System.out.println("Erro nos arrays aí "+aiobe);
                }
        }
        /*Exemplo a = new Exemplo();
        int valor=a.divisao(8,0);
        System.out.println(valor);

         */
        Exemplo um=new Exemplo();
        um.setIdade(-2);


    }
}