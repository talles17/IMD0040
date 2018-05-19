import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Relatorio r = new Relatorio();
		PrintWriter out = null;
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		
		
		for (int i = 0 ; i < num ; i++) {
			r.addPessoa();
		}
		
		try {
			out = new PrintWriter("output.txt");
			for (int i = 0; i < num; i++) {
				out.print("Média de idade: ");
				out.println(r.mediaIdade());
				out.print("Percentual de solteiros: ");
				out.println(r.percentualSolteiros());
				out.print("Percentual de casados: : ");
				out.println(r.percentualCasados());
				out.print("Percentual de viuvos: ");
				out.println(r.percentualViuvos());
				out.print("Percentual de divorciados: ");
				out.println(r.percentualDivorciados());
				out.print("Média do grau de aceitação: ");
				out.println(r.mediaAceitacao());
			}
		}finally {
			if (out != null) {
				out.close();
			}
		}
		
		
	}

}
