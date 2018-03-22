import java.util.LinkedList;
import java.util.Scanner;

public class Locavel
{
	private LinkedList<Veiculo> veiculosCadas, veiculosAlugados;
	public Scanner entrada;

	public Locavel()
	{
		veiculosCadas = new LinkedList<Veiculo>();
		veiculosAlugados = new LinkedList<Veiculo>();
		entrada = new Scanner(System.in);
	}

	
	public String tipoDoVeiculo()
	{
		Scanner entrada = new Scanner(System.in);
		String tipoVeiculo;
		System.out.println("Digite qual veiculo você quer cadastrar(carro ou moto): ");
		tipoVeiculo = entrada.next();
		return tipoVeiculo;
	}

	public void adicionaVeiculo(Veiculo veiculo)
	{
		veiculosCadas.add(veiculo);
	}

	public void alugarVeiculo()
	{
		String nome, numCarteira;
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite o numero da sua carteira de motorista: ");		
		numCarteira = entrada.nextLine();

		
	}
	public void cadastrarVeiculo()
	{
		String veiculo = tipoDoVeiculo();
		if(veiculo.equals("carro")){
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
			adicionaVeiculo(carro);
		}
		else if(veiculo.equals("moto")) {
			String marca, modelo, placa, partida;
			int cinlindradas;
			System.out.println("Marca da moto: ");
			marca = entrada.nextLine();
			System.out.println("Modelo da moto: ");
			modelo = entrada.nextLine();
			System.out.println("Placa da moto: ");
			placa = entrada.nextLine();
			System.out.println("Tipo de partida da moto: ");
			partida = entrada.nextLine();
			System.out.println("Cinlindradas da moto: ");
			cinlindradas = entrada.nextInt();
			Moto moto = new Moto(marca, modelo, placa, partida, cinlindradas);
			adicionaVeiculo(moto);
		}
		else{
			System.out.println("Tipo de veiculo nâo aceito.");
		}
	}

	public void exibirVeiculosCadastrados()
	{
		for(Veiculo v : veiculosCadas){
			if(v instanceof Carro){	
				((Carro)v).print();
			}
			if(v instanceof Moto){
				((Moto)v).print();
			}
		}
	}

}