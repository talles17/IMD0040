public class Pizza extends ProdutoNaoDuravel
{
	private String sabor;
	private int fatias;

	public Pizza(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto, String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String data, String generoProduto, String saborPizza, int fatiasPizza)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  data,generoProduto);
		this.sabor = saborPizza;
		this.fatias = fatiasPizza;
	}
}