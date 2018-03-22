import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		
		Carro carro1 = new Carro("Fiat", "Siena", "ALC23KP", "1.3", 4);
		Carro carro2 = new Carro("Fiat", "Uno", "POE213IK", "1.0",2);
		Carro carro3 = new Carro("Volwksvagen", "Gol", "YUGA231L", "1.6",4);
		Moto moto1 = new Moto("Yamaha", "270x", "POADM21","Eletrica", 400);
		Moto moto2 = new Moto("Honda", "90a", "ASDW124D", "Eletrica", 600);

		Scanner entrada = new Scanner(System.in);
		Locavel locadora = new Locavel();
		locadora.adicionaVeiculo(carro1);
		locadora.adicionaVeiculo(carro2);
		locadora.adicionaVeiculo(carro3);
		locadora.adicionaVeiculo(moto1);
		locadora.adicionaVeiculo(moto2);
		int comando = 1 ;
		while(comando != 0 ){
			System.out.println("Digite 1 para cadastrar veiculo.");
			System.out.println("Digite 2 para exibir veiculos cadastrados.");
			System.out.println("Digite 0 para sair.");
			comando = entrada.nextInt();
			switch(comando) {
				case 0: break;

				case 1: locadora.cadastrarVeiculo();	

				case 2: locadora.exibirVeiculosCadastrados();
						break;
				
				default: System.out.println("Comando invalido.");
						 break;

			
		
			}
		}
	}
}