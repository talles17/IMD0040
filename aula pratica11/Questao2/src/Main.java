/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class Main {
    public static void main (String[] args){
        ContaPoupanca cp = new ContaPoupanca("Carlos", 1 , 400, 25);
        ContaEspecial ce = new ContaEspecial("Joao", 2, 600, 400);
        
        Banco b = new Banco();
        b.adicionarConta(cp);
        b.adicionarConta(ce);
        
        b.imprimirContas();
    }
}
