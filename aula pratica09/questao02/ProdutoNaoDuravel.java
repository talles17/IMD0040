public class ProdutoNaoDuravel extends Produto
{
	private String dataDeValidade;
	private String genero;

	public ProdutoNaoDuravel(String nomeProduto, double preçoProduto, String marcaProduto, String descriçaoProduto,
							 String dataDeFabricaçaoProduto, String data, String generoProduto)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto);
		this.dataDeValidade = data;
		this.genero = generoProduto;
	}

}