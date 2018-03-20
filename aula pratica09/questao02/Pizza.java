public class Pizza extends ProdutoNaoDuravel
{
	private String sabor;
	private int fatias;

	public Pizza(String nomeProduto, float preçoProduto, String marcaProduto, String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String data, String generoProduto, String saborPizza, int fatiasPizza)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  data,generoProduto);
		this.sabor = saborPizza;
		this.fatias = fatiasPizza;
	}
}