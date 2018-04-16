/**
 * @author talles
 *
 */

import java.util.ArrayList; 
import java.util.Scanner;
import java.util.Random;

public class repositorioFormas {

	ArrayList<Forma> repositorio;
	
	public repositorioFormas() {
		repositorio = new ArrayList<Forma>();
	}
	
	public void add(Forma f) {
		repositorio.add(f);
	}
	
	public Circulo circuloAleatorio() {
		Random aleatorio = new Random();
		
		float r = aleatorio.nextFloat() * 100;
		Circulo c = new Circulo(r);
		return c;
				 
	}
	
	public Retangulo retanguloAleatorio() {
		Random aleatorio = new Random();
		
		float l = aleatorio.nextFloat() * 100;
		float a = aleatorio.nextFloat() * 100;
		if (l == a) {
			Quadrado q = new Quadrado(l, a);
			return q;
		}
		else {
			Retangulo r = new Retangulo(l, a);
			return r;
		}
	}
	
	public void gerando() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Circulo ou Retangulo ?");
		String tipo = entrada.next();
		entrada.close();
		if (tipo.equals("Circulo")) {
			add(circuloAleatorio());
		}
		else if (tipo.equals("Retangulo")) {
			add(retanguloAleatorio());
		}
		else {
			System.out.println("Forma nao reconhecida.");
		}
		
	}
	
	public void areaPerimetro() {
		for (Forma f : repositorio) {
		System.out.println("Area: " + f.calcularArea() + " Perimetro: " + f.calcularPerimetro());
		}
	}
}
