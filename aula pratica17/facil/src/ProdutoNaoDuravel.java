public class ProdutoNaoDuravel extends Produto
{
	private String dataDeValidade;
	private String genero;

	public ProdutoNaoDuravel(String idProduto, String nomeProduto, double preçoProduto, String marcaProduto, String descriçaoProduto,
							 String dataDeFabricaçaoProduto, String data, String generoProduto)
	{
		super(idProduto, nomeProduto,preçoProduto,marcaProduto,descriçaoProduto,dataDeFabricaçaoProduto);
		this.dataDeValidade = data;
		this.genero = generoProduto;
	}
	
	@Override
	public void imprimeProduto()
	{
		super.imprimeProduto();
		System.out.print(" Data de Validade: " + this.dataDeValidade + " Genero: " + this.genero);
	}
	
	public boolean disponivelParaVenda(String data)
	{
		String[] valoresHoje = data.split("/");
		String[] valoresValidade = this.dataDeValidade.split("/");
		int diaH = Integer.parseInt(valoresHoje[0]);
		int diaV = Integer.parseInt(valoresValidade[0]);
		int mesH = Integer.parseInt(valoresHoje[1]);
		int mesV = Integer.parseInt(valoresValidade[1]);
		int anoH = Integer.parseInt(valoresHoje[2]);
		int anoV = Integer.parseInt(valoresValidade[2]);
		if (anoH < anoV) {
			return true;
		}
		else if (anoH > anoV) {
			return false;
		}
		else {
			if (mesH < mesV) {
				return true;
			}
			else if (mesH > mesV) {
				return false;
			}
			else {
				if (diaH < diaV) {
					return true;
				}
				else if (diaH > diaV) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		
	}

}