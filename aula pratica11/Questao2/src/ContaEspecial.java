/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class ContaEspecial extends ContaBancaria {
    private double limite;
    
    public ContaEspecial(String c, int n, double s, double l){
        super(c, n , s);
        this.limite = l;
    }
    
    @Override
    public void sacar(double saque){
        if (saque > super.getSaldo()+limite){
            System.out.println("Saldo insuficiente.");
        }
        else {
            super.setSaldo(super.getSaldo() - saque);
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + super.toString() + ", limite: " + limite + '}';
    }
    
    
}
