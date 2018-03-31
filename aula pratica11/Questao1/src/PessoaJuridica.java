/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;
    
    public PessoaJuridica (String n, String e, String t, String cnpjPJ,
                           String nf)
    {
        super(n, e, t);
        this.cnpj = cnpjPJ;
        this.nomeFantasia = nf;
    }
    
    public String getCnpj(){return this.cnpj;}

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    /**
     *
     */
    //@Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Nome da empresa: " + getNomeFantasia());
    }
    
}
