
public class Diretor extends Gerente {

	public Diretor(String n, String d, String c, double s) {
		super(n, d, c, s);
	}
	
	public void bonificacao() {
		setSalario(getSalario() + (getSalario() * 0.20));
		getBonificacoes();
	}
}
