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
    public static void main (String[] args) {
        PessoaFisica pf = new PessoaFisica("Joao", "Rua 21", "88874563", "08894485564");
        PessoaJuridica pj = new PessoaJuridica("Amanda", "Rua 12", "78549878", "5452331", "Loja 2");
        
        pf.imprimirDados();
        pj.imprimirDados();
    }
}
