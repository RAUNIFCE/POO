public class Caminhao extends Moto{
    private int maxkm=5000;
    public Moto(String p,String mo,String ma,double v){
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