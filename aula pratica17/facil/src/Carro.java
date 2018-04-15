public class Carro extends ProdutoDuravel
{
	private String estilo;
	private String portas;

	public Carro(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto,String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto, boolean avaria, 
				 String estiloCarro, String portasCarro)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  mpp,durabilidadeProduto, avaria);
		this.estilo = estiloCarro;
		this.portas = portasCarro;
	}
	
	public boolean eletronico() {
		return false;
	}
}