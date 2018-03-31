/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class Castelo {
    private double defesas;
    private double localizaçao;
    private double pontosVida;
    private String nome;
    
    public Castelo(double d, double l, double p, String n) {
        this.defesas = d;
        this.localizaçao = l;
        this.pontosVida = p;
        this.nome = n;
        //return null;
    }
    
    public void mostrarSituacao() {
        if(pontosVida == 0){
            System.out.println("O " + nome + " foi destruido.");
        }
        else {
            System.out.print("Castelo: " + nome);
            System.out.print("Defesas: " + defesas);
            System.out.print("Localizaçao: " + localizaçao);
            System.out.print("Pontos de vida: " + pontosVida);         
        }
    }
    
    public void ataque(double d) {
        if(defesas > 0){
            defesas -= d;
        }
        else {
            pontosVida -= d;
        }
    }
    
}
