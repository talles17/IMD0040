public abstract class Produto
{
	private String id;
	private String nome;
	private double pre�o;
	private String marca;
	private String descri�ao;
	private String dataDeFabrica�ao;

	public Produto (String idProduto, String nomeProduto, double pre�oProduto, String marcaProduto,
				    String descri�aoProduto, String dataDeFabrica�aoProduto) 
	{
		this.id = idProduto;
		this.nome = nomeProduto;
		this.pre�o = pre�oProduto;
		this.marca = marcaProduto;
		this.descri�ao = descri�aoProduto;
		this.dataDeFabrica�ao = dataDeFabrica�aoProduto;
	}

	public String getNome()
	{
		return this.nome;
	}

	public double getPre�o() 
	{
		return this.pre�o;
	}

	public void imprimeProduto()
	{
		System.out.print("id: " + this.id + " Nome: " + this.nome + " Pre�o: " + this.pre�o + " Marca: " + this.marca +
						   " Descri�ao: " + this.descri�ao + " Data de fabrica�ao: " + this.dataDeFabrica�ao);
	}
	
	public abstract boolean disponivelParaVenda();
}