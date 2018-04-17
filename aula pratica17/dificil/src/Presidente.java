
public class Presidente extends Funcionario {

	public Presidente(String n, String d, String c, double s) {
		super(n, d, c, s);
	}
	
	public void bonificacao() {
		setSalario(getSalario() + (getSalario() * 0.30));
		getBonificacoes();
	}
}
