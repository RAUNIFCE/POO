public class MáquinaDeVendas{
    String idMaquina;
    double saldo;
    int qtdItens;
    public MáquinaDeVendas(){
        this.idMaquina="";
        this.saldo=0.0;
        this.qtdItens=0;
    }
    public MáquinaDeVendas(String id,double s,int qtd){
        this.idMaquina=id;
        this.saldo=s;
        this.qtdItens=qtd;
    }
    public double estimarFaturamentoAnual(double mediaDiaria){
        mediaDiaria=mediaDiaria*365.25;
        return mediaDiaria;
    }
    public double estimarFaturamentoAnual(double mediaDiasUteis,boolean considerarFeriados){
        if(considerarFeriados==true){
            mediaDiasUteis=mediaDiasUteis*252;
            return mediaDiasUteis;
            
        }else{
            mediaDiasUteis=mediaDiasUteis*300;
            return mediaDiasUteis;
        }
    }
    
}