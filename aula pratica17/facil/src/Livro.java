public class Livro extends ProdutoDuravel
{
	private String autor;
	private int paginas;

	public Livro(String nomeProduto, double pre�oProduto, String marcaProduto,String descri�aoProduto,
				 String dataDeFabrica�aoProduto, String mpp, String durabilidadeProduto, 
				 String autorLivro, int paginasLivro)
	{
		super(nomeProduto,pre�oProduto,marcaProduto,descri�aoProduto,dataDeFabrica�aoProduto,
			  mpp,durabilidadeProduto);
		this.autor = autorLivro;
		this.paginas = paginasLivro;
	}
}