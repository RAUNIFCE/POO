import java.util.ArrayList;

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
        //Terceira questao
        System.out.println("\n");
         ArrayList<String> minhaRotina= new ArrayList<>();
         minhaRotina.add("Acordar");
         minhaRotina.add("Tomar café");
         minhaRotina.add("Estudar Java");
         minhaRotina.add(1,"Fazer exercícios");
          for(String r:minhaRotina){//percorrer lista de strings
            System.out.println(r);
        }
        System.out.println("\n");
        //Quarta questao
        minhaRotina.remove(2);
        minhaRotina.remove("Tomar café");
        System.out.println(minhaRotina.size());
        for(String r:minhaRotina){//percorrer lista de strings
            System.out.println(r);
        }
        System.out.println("\n");
        //Quinta questao
        ArrayList<Integer> numerosSorteados= new ArrayList<>();
        numerosSorteados.add(10);
        numerosSorteados.add(14);
        numerosSorteados.add(18);
        numerosSorteados.add(20);
        numerosSorteados.add(30);
        numerosSorteados.add(40);
        System.out.println(numerosSorteados.get(0));
        System.out.println(numerosSorteados.indexOf(40));
        System.out.println(numerosSorteados.get(numerosSorteados.size()-1));
        System.out.println("\n");
        //Sexta questao
        ArrayList<Double> gastosMensais= new ArrayList<>();
        gastosMensais.add(125.50);
        gastosMensais.add(300.00);
        gastosMensais.add(700.75);
        gastosMensais.add(1000.10);
        System.out.println(gastosMensais.contains(50));
        System.out.println(gastosMensais.isEmpty());
        gastosMensais.clear();
        System.out.println(gastosMensais.isEmpty());
        
    }
}
