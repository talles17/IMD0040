public class ProdutoNaoDuravel extends ProdutoNaoDuravel
{
	private String dataDeValidade;
	private String genero;

	public ProdutoNaoDuravel(String nomeProduto, float preçoProduto, String marcaProduto, String descriçaoProduto,
							 String dataDeFabricaçaoProduto, String data, String generoProduto)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto);
		this.dataDeValidade = data;
		this.genero = generoProduto;
	}

}