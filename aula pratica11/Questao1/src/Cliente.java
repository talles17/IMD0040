/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talles
 */
public class Cliente {
    private String nome;
    private String endereço;
    private String telefone;
    
    public Cliente(String n, String e, String t)
    {
        this.nome = n;
        this.endereço = e;
        this.telefone = t;
    }
    
    public String getNome(){return this.nome;}
    
    public String getEndereço(){return this.endereço;}
    public void setEndereço(String e){this.endereço = e;}
    
    public String getTelefone(){return this.telefone;}
    public void setTelefone(String t){this.telefone = t;}
    
    public void imprimirDados()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("Telefone: " + getTelefone());
    }
}
