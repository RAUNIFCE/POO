import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] idade= new int[5];//cria array de tamanho 5
        String[] nomes ={"maria","jose","joao","pedro","miguel"};/* ou  String[] nomes = new String[4];*/
        idade[0]=10;
        idade[2]=25;
        //System.out.println(idade[1]);
        //System.out.println(nomes[4]);
        /*for(String n:nomes){//percorrer lista de strings
            System.out.println(n);
        }*/
        /*for (int i=0;i<5;i++){
            System.out.println(idade[i]);
        }*/
        /*for(int n:idade){
            System.out.println(n);
        }*/
        /*for(int i=0;i< idade.length;i++){//se nao souber o tamanho use .length
            System.out.println(idade[i]);
        }*/
        ArrayList<String> frutas= new ArrayList<>();// a partir daqui nao acesso com frutas[i], mas com frutas.
        frutas.add("Manga");
        frutas.add("Goiaba");
        frutas.add("Caju");

        System.out.println(frutas.size());//retorna a quantidades de itens na lista de frutas
        frutas.add(1,"Morango");
        frutas.add(2,"Pêra");

        for(String f:frutas){//percorrer lista de strings
            System.out.println(f);
        }
        frutas.set(0,"Melancia");//substitui a string naquela posição pela string passado no parametro
        System.out.println("\nsubstituição\n");
        for(String f:frutas){//percorrer lista de strings
            System.out.println(f);
        }
        System.out.println("\n"+frutas.get(2)+"\n");//retorne o elemento na posição 2
        //frutas.remove(0);//remove tal elemento da lista
        //System.out.println(frutas.remove(0));/*mostra oq foi retirado*/

        frutas.remove("Caju");
        for(String f:frutas){//percorrer lista de strings
            System.out.println(f);
        }
        System.out.println(frutas.contains("Maracujá"));//ve se tem tal palavra na lista
        System.out.println(frutas.contains("Goiaba"));//cuidado pq é key sensitive
        frutas.clear();//apaga todos os elementos da lista
        System.out.println(frutas.size());
         System.out.println(frutas.indexOf("Goiaba"));//retorna indice de goiaba
    }
}
