public class Livro extends ProdutoDuravel
{
	private String autor;
	private int paginas;

	public Livro(String nomeProduto, double preçoProduto, String marcaProduto,String descriçaoProduto,
				 String dataDeFabricaçaoProduto, String mpp, String durabilidadeProduto, 
				 String autorLivro, int paginasLivro)
	{
		super(nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto,
			  mpp,durabilidadeProduto);
		this.autor = autorLivro;
		this.paginas = paginasLivro;
	}
}