
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
public class Europeu extends Castelo {
    private int numPaladinos;
    
    public Europeu(double d, double l, double p, String n, int nP) {
        super(d, l, p, n);
        this.numPaladinos = nP;
    }
    
    @Override
    public void mostrarSituacao() {
        super.mostrarSituacao();
        System.out.println("Numero de paladinos: " + numPaladinos);
    }
    
    @Override
    public void ataque(double d) {
        if(numPaladinos > 0) {
            Random aleatorio = new Random();
            numPaladinos -= aleatorio.nextInt(4) + 2;
        }
        else {
            super.ataque(d);
        }
    }
    
    
}
