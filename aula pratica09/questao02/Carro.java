public class Carro extends ProdutoDuravel
{
	private String estilo;
	private String portas;

	public Carro(String nomeProduto, float preçoProduto, String marcaProduto,String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto, 
				 String estiloCarro, String portasCarro)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  mpp,durabilidadeProduto);
		this.estilo = estiloCarro;
		this.portas = portasCarro;
	}
}