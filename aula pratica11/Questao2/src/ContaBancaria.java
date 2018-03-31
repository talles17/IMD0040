/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private double saldo;

  
    
   
    public ContaBancaria(String c, int n, double s){
        this.cliente = c;
        this.num_conta = n;
        this.saldo = s;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     *
     * @param saque
     */
    public void sacar (double saque){
        if(this.saldo <= 0 || this.saldo < saque) {
            System.out.println("Saldo insuficiente para saque.");
        }
        else {
            this.saldo -= saque;
        }
    }
    
    /**
     *
     * @param deposito
     */
    public void depositar (double deposito){
        if(deposito <= 0){
            System.out.println("Valor invalido");
        }
        else {
            this.saldo += deposito;
        }
    }

    @Override
    public String toString() {
        return "cliente: " + cliente + ", num_conta: " + num_conta + ", saldo: " + saldo;
    }
       
}
