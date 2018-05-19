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
	
	void addPessoa() throws IOException  {
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
		} catch (nome.length() > 50 || nome.lenght() < 5) {
			System.out.println("O nome deve conter de 5 a 50 caracteres." + e);
			
		} catch (IllegalArgumentException e) {
			System.out.println("O nome não pode conter números." + e);
		}
		Pessoa p = new Pessoa(nome, idade, estadoCivil, aceitacao);
		l.add(p); 
		
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
