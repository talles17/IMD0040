import java.util.LinkedList;
import java.util.Scanner;

public class Locavel
{
	public LinkedList<Veiculo> veiculos;

	public Locavel()
	{
		veiculos = new LinkedList<Veiculo>();
	}

	
	public String tipoDoVeiculo()
	{
		Scanner entrada = new Scanner(System.in);
		String tipoVeiculo;
		System.out.println("Digite qual veiculo você quer cadastrar(carro ou moto): ");
		tipoVeiculo = entrada.next();
		return tipoVeiculo;
	}

	public void cadastrarVeiculo()
	{
		String veiculo = tipoDoVeiculo();
		if(veiculo == "carro"){
			Scanner entrada = new Scanner(System.in);
			String marca, modelo, placa, potencia;
			int portas;
			System.out.println("Marca do carro: ");
			marca = entrada.nextLine();
			System.out.println("Modelo do carro: ");
			modelo = entrada.nextLine();
			System.out.println("Placa do carro: ");
			placa = entrada.nextLine();
			System.out.println("Potencia do motor: ");
			potencia = entrada.nextLine();
			System.out.println("Quantidade de portas: ");
			portas = entrada.nextInt();
			Carro carro = new Carro(marca, modelo, placa, potencia, portas);
			veiculos.add(carro);
		}
		else if(veiculo == "moto") {

		}
		else{
			System.out.println("Tipo de veiculo nâo aceito.");
		}

	}
}