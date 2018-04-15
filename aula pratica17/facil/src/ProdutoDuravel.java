public abstract class ProdutoDuravel extends Produto
{
	private String materialPredom;
	private String durabilidade;
	private boolean avaria;

	public ProdutoDuravel(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto,String descriçaoProduto,
						  String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto, boolean avariaProduto)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto);
		this.materialPredom = mpp;
		this.durabilidade = durabilidadeProduto;
		this.avaria = avariaProduto;
	}
	
	@Override
	public void imprimeProduto()
	{
		super.imprimeProduto();
		System.out.print(" Material Predominante: " + this.materialPredom + " Durabilidade: " + this.durabilidade);
	}
	
	public boolean disponivelParaVenda() 
	{
		if(this.avaria) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public abstract boolean eletronico();
}