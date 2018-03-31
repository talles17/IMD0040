
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class Banco {
    private LinkedList<ContaBancaria> banco;
    
    public Banco() {
        banco = new LinkedList<>();
    }
    
    public void adicionarConta(ContaBancaria x){
        banco.add(x);
    }
    
    public void imprimirContas() {
        banco.forEach((x) -> {
            System.out.println(x.toString());
        });
    }
    
}
