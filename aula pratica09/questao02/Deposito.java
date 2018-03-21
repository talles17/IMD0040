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

	
	public int quantidadeDeProdutos()
	{
		return produtos.size();
	}

	public void depositoVazio()
	{
		if(produtos.size() == 0) {
			System.out.println("O deposito está vazio.");
		}
		else {
			System.out.println("O deposito não está vazio.");
		}
	}

	public void maiorValor()
	{

	}

	public static void main (String[] args)
	{
		Deposito dep1 = new Deposito();

		Carro carro1 = new Carro("Siena", 40000, "Fiat", "Carro sedan da fiat.", "2015", "Metal", "Sedan", "4 portas");
		dep1.adicionarProdutos(carro1);

		Pizza pizza1 = new Pizza("Pizza", 9.50, "Sadia", "Pizza da Sadia", "20/03/2018", "20/04/2018",
								 "Alimento congelado", "Quatro Queijos", 8);
		dep1.adicionarProdutos(pizza1);

		Livro livro1 = new Livro("Senhor dos Aneis", 48.50, "Editora", "Livro sobre a trilogia do senhor dos aneis.",
								 "20/03/2018", "folha", "Infinita", "tolkien", 900);
		dep1.adicionarProdutos(livro1);

		System.out.println("Quantidade de produtos: " +dep1.quantidadeDeProdutos());
	}

}