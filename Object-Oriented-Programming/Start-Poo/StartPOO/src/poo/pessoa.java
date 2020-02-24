/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;



public class pessoa {
    private String nome;
    public String telefone;
    public String email;
    
    public pessoa(String nome,String telefone,String email){    
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

   public pessoa(){
   
   }
    
    public void ImprimiDados(){
        System.out.println("Impressao dos dados \n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.telefone);
        System.out.println("Nome: " + this.email); 
        

    
    }
    
    public void setNome(String nome){
       this.nome = nome;    
    }
    
     public String getNome(){
       return this.nome;   
    }
    
}
