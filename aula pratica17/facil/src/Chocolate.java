public class Chocolate extends ProdutoNaoDuravel
{
	private String sabor;

	public Chocolate(String nomeProduto, double pre�oProduto, String marcaProduto, String descri�aoProduto,
				 	String dataDeFabrica�aoProduto, String data, String generoProduto, String saborChoco)
	{
		super(nomeProduto,pre�oProduto,marcaProduto,descri�aoProduto,dataDeFabrica�aoProduto,
			  data,generoProduto);
		this.sabor = saborChoco;
	}
}