public class Moto extends Veiculo
{
	private String tipoDePartida;
	private int cinlindradas;

	public Moto(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String partidaMoto, int cinliMoto)
	{
		super(marcaVeiculo, modeloVeiculo, placaVeiculo);
		this.tipoDePartida = partidaMoto;
		this.cinlindradas = cinliMoto;
	}

	public String getPartida(){return this.tipoDePartida;}
	public int getCinlin(){return this.cinlindradas;}

	public void print()
	{
		System.out.println("Moto: " + getMarca() + " Modelo: " + getModelo() + " Placa: " + getPlaca() +
						   " Partida: " + getPartida() + " Cinlindradas: " + getCinlin());
	}
}