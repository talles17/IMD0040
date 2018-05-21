import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
//import java.io.IOException;

public class Relatorio {
	private LinkedList<Pessoa> l;
	public Scanner entrada;
	
	public Relatorio() {
		l = new LinkedList<Pessoa>();
		entrada = new Scanner(System.in);
	}
	
	void addPessoa() throws Exception {
		String linha = entrada.nextLine();
		String[] dados = linha.split("-");
		
		String nome;
		int idade, aceitacao;
		char estadoCivil;
		 
		
		try {
			nome = dados[0];
			idade = Integer.parseInt(dados[1]);
			estadoCivil = dados[2].charAt(2);
			aceitacao = Integer.parseInt(dados[3]);
			if (dados[0].length() < 5 || dados[0].length() > 50) {
				throw new Exception("O nome deve conter de 5 a 50 caracteres.");
			}
			if (nome.matches("[0-9]+")) {
				throw new Exception("O nome não pode conter números.");
			}
			if (idade < 0 || idade > 127) {
				throw new Exception("A idade deve ser um inteiro entre 0 a 127.");
			}
			if (dados[2].length() > 1) {
				throw new Exception("Informe Estado civil com somente um caracter.");
			}
			if (estadoCivil != 'S' || estadoCivil != 'C' || estadoCivil != 'V' || estadoCivil != 'D') {
				throw new Exception("Opção inválida no Estado Civil");
			}
			if (aceitacao < 0 || aceitacao > 10) {
				throw new Exception("O grau de aceitação deve ser entre 0 a 10.");
			}
		} finally {
			Pessoa p = new Pessoa(nome, idade, estadoCivil, aceitacao);
			l.add(p); 
		}
		
		
	}
	
	public float mediaIdade() {
		int soma = 0;
		for (Pessoa x : l) {
			soma += x.getIdade();
		}
		return soma/l.size();
	}
	
	public float mediaAceitacao() {
		int soma = 0;
		for (Pessoa x : l) {
			soma += x.getAceitacao();
		}
		return soma/l.size();
	}
	
	public float percentualCasados() {
		int casados = 0;
		for (Pessoa x : l) {
			if(x.getEstadoCivil() == 'C') {
				casados += 1;
			}
		}
		return (casados*100)/l.size();
	}
	
	public float percentualSolteiros() {
		int solteiros = 0;
		for (Pessoa x : l) {
			if(x.getEstadoCivil() == 'S') {
				solteiros += 1;
			}
		}
		return (solteiros*100)/l.size();
	}
	
	public float percentualViuvos() {
		int viuvos = 0;
		for (Pessoa x : l) {
			if(x.getEstadoCivil() == 'V') {
				viuvos += 1;
			}
		}
		return (viuvos*100)/l.size();
	}
	
	public float percentualDivorciados() {
		int divorciados = 0;
		for (Pessoa x : l) {
			if(x.getEstadoCivil() == 'D') {
				divorciados += 1;
			}
		}
		return (divorciados*100)/l.size();
	}
}
