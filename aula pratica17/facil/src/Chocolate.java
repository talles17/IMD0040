public class Chocolate extends ProdutoNaoDuravel
{
	private String sabor;

	public Chocolate(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto, String descriçaoProduto,
				 	String dataDeFabricaçaoProduto, String data, String generoProduto, String saborChoco)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  data,generoProduto);
		this.sabor = saborChoco;
	}
}