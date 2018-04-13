public class Refrigerante extends ProdutoNaoDuravel
{
	private String sabor;
	private String quantidade;

	public Refrigerante(String nomeProduto, double pre�oProduto, String marcaProduto, String descri�aoProduto,
				 		String dataDeFabrica�aoProduto, String data, String generoProduto, String saborRefri,
				 		String quantidadeRefri)
	{
		super(nomeProduto,pre�oProduto,marcaProduto,descri�aoProduto,dataDeFabrica�aoProduto,
			  data,generoProduto);
		this.sabor = saborRefri;
		this.quantidade = quantidadeRefri;
	}
}