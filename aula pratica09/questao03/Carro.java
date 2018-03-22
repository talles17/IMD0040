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

	public String getPotencia(){return this.potenciaDoMotor;}

	public int getPortas(){return this.quantidadeDePortas;}

	public void print()
	{
		System.out.println("Carro: " + getMarca() + " Modelo: " + getModelo() + " Placa: " + getPlaca() +
						   " Potencia: " + getPotencia() + " Portas: " + getPortas());
	}
}