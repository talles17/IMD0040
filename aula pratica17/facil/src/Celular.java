public class Celular extends ProdutoDuravel
{
	private String processador;
	private String memoria;

	public Celular(String nomeProduto, double pre�oProduto, String marcaProduto,String descri�aoProduto,
				 String dataDeFabrica�aoProduto, String mpp, String durabilidadeProduto, 
				 String processadorCel, String memoriaCel)
	{
		super(nomeProduto,pre�oProduto,marcaProduto,descri�aoProduto,dataDeFabrica�aoProduto,
			  mpp,durabilidadeProduto);
		this.processador = processadorCel;
		this.memoria = memoriaCel;
	}
}