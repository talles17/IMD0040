
public class Pessoa {
	private String nome;
	private int idade;
	private char estadoCivil;
	private int aceitacao;

	public Pessoa(String n, int i, char ec, int a) {
		this.nome = n;
		this.idade = i;
		this.estadoCivil = ec;
		this.aceitacao = a;
	}

	public int getIdade() {
		return idade;
	}
	
	public char getEstadoCivil() {
		return estadoCivil;
	}
	
	public int getAceitacao() {
		return aceitacao;
	}
}
