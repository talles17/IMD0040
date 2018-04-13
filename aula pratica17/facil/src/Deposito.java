import java.util.LinkedList;

public class Deposito 
{
	private LinkedList<Produto> produtos;
	
	
	public Deposito()
	{
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
		if(produtos.size() > 0){
			String maxProduto = "";
			double maxValor = 0;
			for (Produto p : produtos) { 
				//System.out.println(p.getNome());
				if(p.getPre�o() > maxValor){
					maxProduto = p.getNome();
					maxValor = p.getPre�o();
				}
			}
			System.out.println("O produto de maior valor no deposito é o " + maxProduto);
			
			/*String maxProduto;
			double maxValor = 0;
			produtos.forEach((temp) -> {
				if(temp.getPre�o() > maxValor){
					maxProduto = temp.getNome();
					maxValor = temp.getPre�o();
				}		
			}); */		
		}
		else {
			System.out.println("O deposito está vazio.");
		}
	}


}