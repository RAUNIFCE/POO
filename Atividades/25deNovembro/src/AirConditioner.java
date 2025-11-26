public class AirConditioner implements DispositivoEletronico{
    public void liga(){
        System.out.println("Liga o compressor e ajusta para 24 graus.");
    }
    public void desliga(){
        System.out.println("Desliga o compressor, mas mantendo a ventilação");
    }
}
