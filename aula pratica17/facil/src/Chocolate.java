public class Chocolate extends ProdutoNaoDuravel
{
	private String sabor;

	public Chocolate(String nomeProduto, double preçoProduto, String marcaProduto, String descriçaoProduto,
				 	String dataDeFabricaçaoProduto, String data, String generoProduto, String saborChoco)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  data,generoProduto);
		this.sabor = saborChoco;
	}
}