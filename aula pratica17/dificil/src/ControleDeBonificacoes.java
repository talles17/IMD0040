import java.util.LinkedList;

public class ControleDeBonificacoes {

	//private LinkedList<Funcionario> f;
	private int numTotalBonificacoes;
	
	public ControleDeBonificacoes() {
		//f = new LinkedList<Funcionario>();
		numTotalBonificacoes = 0;
	}
	
	public void registraBonificacao(Funcionario f) {
		if (numTotalBonificacoes >= 10) {
			System.out.println("O numero de bonificacoes totais(10) foi atingida.");
		}
		else {
			f.bonificacao();
			this.numTotalBonificacoes++;
		}
	}
}
