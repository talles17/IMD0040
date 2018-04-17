/**
 * 
 */

/**
 * @author talles
 *
 */
public abstract class Funcionario {

	private String nome;
	private String dataDeNascimento;
	private String cpf;
	private double salario;
	private int numBonificacoes;
	
	
	public Funcionario(String n, String d, String c, double s) {
		this.nome = n;
		this.dataDeNascimento = d;
		this.cpf = c;
		this.salario = s;
		this.numBonificacoes = 0;
	}
	
	public abstract void bonificacao();
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double s) {
		this.salario = s;
	}
	
	public int getNumBonificacoes() {
		return this.numBonificacoes;
	}
	
	public void getBonificacoes() {
		if (this.numBonificacoes >= 5) {
			System.out.println("O numero de bonificacoes maxima(5) ja foi atingido.");
		}
		else {
			this.numBonificacoes++;
		}	
	} 
	
}
