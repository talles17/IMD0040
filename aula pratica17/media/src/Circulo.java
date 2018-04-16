//import java.lang.Object;
import java.lang.Math;

public class Circulo extends Forma {

	private float raio;
	
	public Circulo(float r) {
		this.raio = r;
	}
	
	public float calcularArea() {
		return (float)Math.PI * (raio * raio);
	}
	
	public float calcularPerimetro() {
		return (2 * (float)Math.PI) * raio; 
	}
	
}
