public class ProdutoDuravel extends Produto
{
	String materialPredom;
	String durabilidade;

	public ProdutoDuravel(String nomeProduto, double preçoProduto, String marcaProduto,String descriçaoProduto,
						  String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto);
		this.materialPredom = mpp;
		this.durabilidade = durabilidadeProduto;
	}
}