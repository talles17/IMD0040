public class Carro extends ProdutoDuravel
{
	private String estilo;
	private String portas;

	public Carro(String nomeProduto, double pre�oProduto, String marcaProduto,String descri�aoProduto,
				 String dataDeFabrica�aoProduto, String mpp, String durabilidadeProduto, 
				 String estiloCarro, String portasCarro)
	{
		super(nomeProduto,pre�oProduto,marcaProduto,descri�aoProduto,dataDeFabrica�aoProduto,
			  mpp,durabilidadeProduto);
		this.estilo = estiloCarro;
		this.portas = portasCarro;
	}
}