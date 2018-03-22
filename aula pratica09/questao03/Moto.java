public class Java extends Veiculo
{
	private String tipoDePartida;
	private int cinlindradas;

	public Moto(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String partida, int cinliMoto);
	{
		super(marcaVeiculo, modeloVeiculo, placaVeiculo);
		this.tipoDePartida = partida;
		this.cinlindradas = cinliMoto;
	}
}