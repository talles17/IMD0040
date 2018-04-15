


public class Main
{
	public static void main (String[] args)
		{
			Deposito dep1 = new Deposito();

			
			Carro carro1 = new Carro("12312", "Siena", 40000, "Fiat", "Carro sedan da fiat.", "2015", "Metal",
									"10 anos", false, "Sedan", "4 portas");
			dep1.adicionarProdutos(carro1);

			Pizza pizza1 = new Pizza("213124", "Pizza", 9.50, "Sadia", "Pizza da Sadia", "20/03/2018", "20/04/2018",
									 "Alimento congelado", "Quatro Queijos", 8);
			dep1.adicionarProdutos(pizza1);

			Livro livro1 = new Livro("123213", "Senhor dos Aneis", 48.50, "Editora", "Livro sobre a trilogia do senhor dos aneis.",
									 "20/03/2018", "folha", "Infinita", true, "tolkien", 900);
			dep1.adicionarProdutos(livro1);

			dep1.maiorValor();
			System.out.println("Quantidade de produtos: " +dep1.quantidadeDeProdutos());
		}
}
