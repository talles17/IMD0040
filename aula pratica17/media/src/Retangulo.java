
public class Retangulo extends Forma {

	private float lado;
	private float altura;
	
	public Retangulo(float l, float a) {
		this.lado = l;
		this.altura = a;
	}
	
	public float calcularArea() { 
		return lado * altura;			
	}
	
	public float calcularPerimetro() {
		return 2 * (lado + altura);
	}

}
