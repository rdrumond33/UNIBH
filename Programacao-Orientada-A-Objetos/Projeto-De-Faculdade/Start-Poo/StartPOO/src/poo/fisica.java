/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Felipe Leandro
 */
public class fisica extends pessoa {
     public String cpf;
     
     public fisica(String nome,String telefone,String email, String cpf){
         super(nome,telefone,email);
         this.cpf = cpf;       
     }
     
     public fisica(){}
     
     public void ImprimiDados(){
        System.out.println("Impressao dos dados \n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);   
        System.out.println("CPF: " + this.cpf); 
    }
}

