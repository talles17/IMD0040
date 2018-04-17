import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Funcionario> f = new LinkedList<Funcionario>();
		Gerente g = new Gerente("aaa", "23/02/1992", "12321421", 10000);
		Presidente p = new Presidente("bbb", "12/04/1992", "23432423", 18000);
		Diretor d = new Diretor("aaa", "20/10/1988", "13423235", 20000);
		
		f.add(g);
		f.add(p);
		f.add(d);
		
		for (Funcionario x : f) {
			System.out.println("Salario sem bonificacao: " + x.getSalario());		
		}
		for (int i = 0 ; i < 4 ; i++) {
			for (Funcionario x : f) {
				x.bonificacao();
			}
		}
		for (Funcionario x : f) {
			System.out.println("Salario com "+ x.getNumBonificacoes() + " bonificacoes: " + x.getSalario());		
		}
	}

}
