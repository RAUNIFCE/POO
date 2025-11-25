
public class Main
{
	public static void main(String[] args) {
	    //Veiculo v=new Veiculo("abcde","toyota","hyundai",30.00);
		Carro c=new Carro("abcde","toyota","hyundai",30.00);
		c.exibirFichaTecnica();
		c.precisaDeManutencao(50000);
		c.calcularcusto(10);
		
	}
}