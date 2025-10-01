//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int temperaturas[]={22, 25, 19, 28, 26, 23, 30};
        int soma=0;
        for(int n:temperaturas){
            soma=soma+n;
        }

        int diamaiortemp=0;
        for(int n:temperaturas){
            if(n>=25){
                diamaiortemp++;
            }
        }
        System.out.println(soma+" é a soma das temperaturas  e "+diamaiortemp+" é o numero de dias com temperaturas maior de 24");
        //Segunda questão
        /* Confusões
        ArrayList<String> nomesProdutos= new ArrayList<>();
        nomesProdutos.add("Laptop");
        nomesProdutos.add("Mouse");
        nomesProdutos.add("Teclado");
        nomesProdutos.add("Monitor");
        System.out.println(nomesProdutos.get(0));//imprime primero produto da lista
        nomesProdutos.set(3,"Fone de Ouvido");
        */
         String[] nomesProdutos={"Laptop", "Mouse", "Teclado", "Monitor"};
        System.out.println(nomesProdutos[0]);
        nomesProdutos[nomesProdutos.length-1]="Fone de Ouvido";
        for(int i=0;i< nomesProdutos.length;i++){
            System.out.println(nomesProdutos[i]);
        }
    }
}