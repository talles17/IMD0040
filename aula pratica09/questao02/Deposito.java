public class Deposito 
{
	private LinkedList<Produto> produtos;
	/*private LinkedList<Livro> Livros;
	private LinkedList<Celular> Celulares;
	private LinkedList<Pizza> Pizzas;
	private LinkedList<Refrigerante> Refrigerantes;
	private LinkedList<Chocolate> Chocolates;
*/
	public Deposito()
	{
		/*private LinkedList<Carro> Carros = new LinkedList<Carro>();
		private LinkedList<Livro> Livros = new LinkedList<Livro>();
		private LinkedList<Celular> Celulares = new LinkedList<Celular>();
		private LinkedList<Pizza> Pizzas = new LinkedList<Pizza>();
		private LinkedList<Refrigerante> Refrigerantes = new LinkedList<Refrigerante>();
		private LinkedList<Chocolate> Chocolates = new LinkedList<Chocolate>();
	*/
		produtos = new LinkedList<Produto>();

	}

	public void adicionarProdutos(Produto produto)
	{
		produtos.add(produto);
	}

	public void removerProdutos(Produto produto)
	{
		produtos.remove(produto);
	}

	


}