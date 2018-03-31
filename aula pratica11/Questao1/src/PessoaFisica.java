/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class PessoaFisica extends Cliente {
    private String cpf;
    
    public PessoaFisica(String n, String e, String t, String cpfPF)
    {
        super(n, e, t);
        this.cpf = cpfPF;
    }
    
    public String getCpf(){return this.cpf;}
    
    public void imprimirDados()
    {
        super.imprimirDados();
        System.out.println("CPF: " + getCpf());
    }
    
}
