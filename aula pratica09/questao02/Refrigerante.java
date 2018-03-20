public class Refrigerante extends ProdutoNaoDuravel
{
	private String sabor;
	private String quantidade;

	public Refrigerante(String nomeProduto, float preçoProduto, String marcaProduto, String descriçaoProduto,
				 		String dataDeFabricaçaoProduto, String data, String generoProduto, String saborRefri,
				 		String quantidadeRefri)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  data,generoProduto);
		this.sabor = saborRefri;
		this.quantidade = quantidadeRefri;
	}
}