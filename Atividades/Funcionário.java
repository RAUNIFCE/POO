public class Funcionário {
    String nome;
    Double salario;
    String cargo;
    public void SLíquido(){
        Double imposto;
        if(this.salario<=2000){
            System.out.printf("isento de imposto");
        }
        else if(this.salario>=2000.01 && this.salario<=3000){
            imposto=((this.salario-2000)*0.08);
            System.out.printf("seu valor a ser pago é R$ %.2f",imposto );
        }
        else if(this.salario>=3000.01 && this.salario<=4500){
            imposto=((1000*0.08)+((this.salario-3000)*0.18));
            System.out.printf("seu valor a ser pago é R$ %.2f",imposto );
        }
        else if(this.salario>=4500){
            imposto=((1000*0.08)+(1500*0.18)+((this.salario-4500)*0.28));
            System.out.printf("seu valor a ser pago é R$ %.2f",imposto );
        }
    }


}
