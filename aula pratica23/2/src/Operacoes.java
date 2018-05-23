import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;

public class Operacoes {
	private ArrayList<String> resultados;
	
	
	public Operacoes() {
		resultados = new ArrayList();
	}
	
	public void leArquivo(String arquivoIn) throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(arquivoIn));
			String linha = reader.readLine();
			int num1, num2;
			String resultado;
			while(linha != null) {
				if(linha.length() == 3) {
					
					if (linha.charAt(1) == '+') {
						num1 = Character.getNumericValue(linha.charAt(0));
						num2 = Character.getNumericValue(linha.charAt(2));
						resultado = Float.toString(num1 + num2);
						resultados.add(resultado);
					}
					if (linha.charAt(1) == '-') {
						num1 = Character.getNumericValue(linha.charAt(0));
						num2 = Character.getNumericValue(linha.charAt(2));
						resultado = Float.toString(num1 - num2);
						resultados.add(resultado);
					}
					if (linha.charAt(1) == '*') {
						num1 = Character.getNumericValue(linha.charAt(0));
						num2 = Character.getNumericValue(linha.charAt(2));
						resultado = Float.toString(num1 * num2);
						resultados.add(resultado);
					}
					if (linha.charAt(1) == '/') {
						if (linha.charAt(2) == '0') {
							resultados.add("não foi possivel calcular");
						}
						else {
							num1 = Character.getNumericValue(linha.charAt(0));
							num2 = Character.getNumericValue(linha.charAt(2));
							resultado = Float.toString(num1 / num2);
							resultados.add(resultado);
						}
					}
				}	
				else {
					resultados.add("não foi possivel calcular");
				}
				
				linha = reader.readLine();
			}
			reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado " + e);
		}
		catch(IOException e) {
			System.out.println("Erro " + e);
		}
	}
	
	public void salvaArquivo(String arquivoOut) {
		int i = 0;
		try {
			FileWriter writer = new FileWriter(arquivoOut);
			for(String x : resultados) {
				writer.write(x + "\n");
			}
			writer.close();
		}
		catch(IOException e) {
			System.out.println("erro " + e);
		}		
	}
	
}
