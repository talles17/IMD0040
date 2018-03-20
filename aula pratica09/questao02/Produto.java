public class Produto
{
	private String nome;
	private float preço;
	private String marca;
	private String descriçao;
	private String dataDeFabricaçao;

	public Produto (String nomeProduto, float preçoProduto, String marcaProduto,
				    String descriçaoProduto, String dataDeFabricaçaoProduto) 
	{
		this.nome = nomeProduto;
		this.preço = preçoProduto;
		this.marca = marcaProduto;
		this.descriçao = descriçaoProduto;
		this.dataDeFabricaçao = dataDeFabricaçaoProduto;
	}

}