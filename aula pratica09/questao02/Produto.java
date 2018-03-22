public class Produto
{
	private String nome;
	private double preço;
	private String marca;
	private String descriçao;
	private String dataDeFabricaçao;

	public Produto (String nomeProduto, double preçoProduto, String marcaProduto,
				    String descriçaoProduto, String dataDeFabricaçaoProduto) 
	{
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

}