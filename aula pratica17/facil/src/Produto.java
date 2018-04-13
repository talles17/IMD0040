public abstract class Produto
{
	private String id;
	private String nome;
	private double preço;
	private String marca;
	private String descriçao;
	private String dataDeFabricaçao;

	public Produto (String idProduto, String nomeProduto, double preçoProduto, String marcaProduto,
				    String descriçaoProduto, String dataDeFabricaçaoProduto) 
	{
		this.id = idProduto;
		this.nome = nomeProduto;
		this.preço = preçoProduto;
		this.marca = marcaProduto;
		this.descriçao = descriçaoProduto;
		this.dataDeFabricaçao = dataDeFabricaçaoProduto;
	}

	public String getNome()
	{
		return this.nome;
	}

	public double getPreço() 
	{
		return this.preço;
	}

	public void imprimeProduto()
	{
		System.out.print("id: " + this.id + " Nome: " + this.nome + " Preço: " + this.preço + " Marca: " + this.marca +
						   " Descriçao: " + this.descriçao + " Data de fabricaçao: " + this.dataDeFabricaçao);
	}
	
	public abstract boolean disponivelParaVenda();
}