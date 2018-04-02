
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class Mapa {
    private final int n;
    private char[][] mapa;
    
    public Mapa(int n) {
        this.n = n;
        mapa = new char[n][n];
        for (char[] row: mapa) {
            Arrays.fill(row, '0');
        }
    }
    
    public void mostrarMapa() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     *
     * @param ch tipo de peça do jogo
     * @param l posiçao da linha do tabuleiro
     * @param c posiçao da coluna do tabuleiro
     */
    public void botaNoMapa(char ch, int l , int c) {
        if(l > n || c > n) {
            System.out.println("Fora do limite("+ n +") do mapa.");
        }
        else if(mapa[l][c] != '0') {
            System.out.println("Posição ja ocupada.");
        }
        else {
            mapa[l][c] = ch;
        }
    }
}
