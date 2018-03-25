
public class Veiculo 
{
	private String marca;
	private String modelo;
	private String placa;
	private boolean alugado;
	private String nomeAlugador;
	private String carteiraAlugador;

	public Veiculo(String marcaVeiculo, String modeloVeiculo, String placaVeiculo)
	{
		this.marca = marcaVeiculo;
		this.modelo = modeloVeiculo;
		this.placa = placaVeiculo;
	}

	public String getMarca(){return this.marca;}

	public String getModelo(){return this.modelo;}

	public String getPlaca(){return this.placa;}

	public void setTrueAlugado(){this.alugado = true;}

	public String getNomeAlugador(){return this.nomeAlugador;}

	public void setNomeAlugador(String nome){this.nomeAlugador = nome;}

	public String getCarteiraAlugador(){return this.carteiraAlugador;}

	public void setCarteiraAlugador(String carteira){this.carteiraAlugador = carteira;}
	



	
}