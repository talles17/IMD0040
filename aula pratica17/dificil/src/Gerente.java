
public class Gerente extends Funcionario {

	public Gerente(String n, String d, String c, double s) {
		super(n, d, c, s);
	}
	
	public void bonificacao() {
		setSalario(getSalario() + (getSalario() * 0.10));
		getBonificacoes();
	}
}
