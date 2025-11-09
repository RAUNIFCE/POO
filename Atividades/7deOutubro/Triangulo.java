public class Triangulo {
    float l1;
    float l2;
    float l3;
    public Triangulo(float a,float b,float c){
        if (a>0&&b>0&&c>0){
            this.l1=a;
            this.l2=b;
            this.l3=c;
        }else{
            System.out.println("Digite positivos");
        }

    }
    public boolean verificarvalidade(){
        float a=this.l1;
        float b=this.l2;
        float c=this.l3;
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }else{
            return false;
        }
    }
}
