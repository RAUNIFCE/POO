import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<DispositivoEletronico> dispositivo=new ArrayList<>();
        AirConditioner ac=new AirConditioner();
        SmartLamp sl=new SmartLamp();
        SoundSystem ss=new SoundSystem();
        PlantaArtificial pa=new PlantaArtificial();
        dispositivo.add(ac);
        dispositivo.add(sl);
        dispositivo.add(ss);
        //dispositivo.add(pa); erro
        for (DispositivoEletronico de: dispositivo){
            de.liga();
        }
        for (DispositivoEletronico de: dispositivo){
            de.desliga();
        }

    }
}