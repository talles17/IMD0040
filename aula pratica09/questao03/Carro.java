public class Carro extends Veiculo
{
	private String potenciaDoMotor;
	private int quantidadeDePortas;

	public Carro(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String potencia, int portas) 
	{
		super(marcaVeiculo, modeloVeiculo, placaVeiculo);
		this.potenciaDoMotor = potencia;
		this.quantidadeDePortas = portas;
	}
}