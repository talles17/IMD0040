
public class Veiculo 
{
	private String marca;
	private String modelo;
	private String placa;

	public Veiculo(String marcaVeiculo, String modeloVeiculo, String placaVeiculo)
	{
		this.marca = marcaVeiculo;
		this.modelo = modeloVeiculo;
		this.placa = placaVeiculo;
	}

	public String getMarca(){return this.marca;}

	public String getModelo(){return this.modelo;}

	public String getPlaca(){return this.placa;}

	
}