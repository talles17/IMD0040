public class Livro extends ProdutoDuravel
{
	private String autor;
	private int paginas;

	public Livro(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto,String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto, boolean avaria, 
				 String autorLivro, int paginasLivro)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  mpp,durabilidadeProduto,avaria);
		this.autor = autorLivro;
		this.paginas = paginasLivro;
	}
	
	
	public boolean eletronico() 
	{
		return false;
	}
}