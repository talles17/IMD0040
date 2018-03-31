
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class Japones extends Castelo {
    private int numSamurais;
    
    public Japones (double d, double l, double p, String n, int ns) {
        super(d, l, p, n);
        this.numSamurais = ns;
    }
    
    @Override
    public void mostrarSituacao() {
        super.mostrarSituacao();
        System.out.println("Numero de samurais: " + numSamurais);     
    }
    
    @Override
    public void ataque(double d) {
        if(numSamurais > 0) {
            Random aleatorio = new Random();
            numSamurais -= aleatorio.nextInt(4) + 2;
        }
        else {
            super.ataque(d);
        }
    }
    
}
