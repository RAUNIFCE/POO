public class Caminhao extends Veiculo{
    private int maxkm=20000;
    public Caminhao(String p,String mo,String ma,double v){
        super(p,mo,ma,v);
    }
    @Override
    public void precisaDeManutencao(int kmRodados){
        if(kmRodados>maxkm){
        System.out.println("Precisa");
        }else{
            System.out.println("Precisa não");

        }
    }
}