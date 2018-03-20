public class Celular extends ProdutoDuravel
{
	private String processador;
	private String memoria;

	public Celular(String nomeProduto, float preçoProduto, String marcaProduto,String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto, 
				 String processadorCel, String memoriaCel)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  mpp,durabilidadeProduto);
		this.processador = processadorCel;
		this.memoria = memoriaCel;
	}
}