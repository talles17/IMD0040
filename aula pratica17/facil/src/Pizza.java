public class Pizza extends ProdutoNaoDuravel
{
	private String sabor;
	private int fatias;

	public Pizza(String nomeProduto, double pre�oProduto, String marcaProduto, String descri�aoProduto,
				 String dataDeFabrica�aoProduto, String data, String generoProduto, String saborPizza, int fatiasPizza)
	{
		super(nomeProduto,pre�oProduto,marcaProduto,descri�aoProduto,dataDeFabrica�aoProduto,
			  data,generoProduto);
		this.sabor = saborPizza;
		this.fatias = fatiasPizza;
	}
}