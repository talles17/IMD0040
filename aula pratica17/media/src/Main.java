import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		repositorioFormas f = new repositorioFormas();
		Scanner entrada = new Scanner(System.in);
		int x = 1;
		
		while (x != 0) {
			f.gerando();
			f.areaPerimetro();
			System.out.print("Digite 1 para gerar uma nova forma ou 0 para sair.");
			x = Integer.parseInt(entrada.nextLine());
		}
		entrada.close();
		
		//f.areaPerimetro();
	}

}
