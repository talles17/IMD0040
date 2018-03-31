/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class ContaPoupanca extends ContaBancaria {

    private int Dia_de_rendimento;

    public ContaPoupanca(String c, int n, double s, int d) {
        super(c, n, s);
        this.Dia_de_rendimento = d;
    }

    /**
     *
     * @param rendimento
     */
    public void calcularNovoSaldo(double rendimento) {
        super.depositar(rendimento);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + super.toString() + ", Dia_de_rendimento: " + Dia_de_rendimento + '}';
    }
    
    
}
