public class Carro extends Veiculo{
    private int maxkm=10000;
    public Carro(String p,String ma,String mo,double v){
        super(p,mo,ma,v);
    }

    @Override
    public void precisaDeManutencao(int kmRodados) {
      if (kmRodados>maxkm){
      System.out.println("Precisa");
      }else{
          System.out.println("Precisa não");
      }
    }


}
