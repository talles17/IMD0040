public class Refrigerante extends ProdutoNaoDuravel
{
	private String sabor;
	private String quantidade;

	public Refrigerante(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto, String descriçaoProduto,
				 		String dataDeFabricaçaoProduto, String data, String generoProduto, String saborRefri,
				 		String quantidadeRefri)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  data,generoProduto);
		this.sabor = saborRefri;
		this.quantidade = quantidadeRefri;
	}
}