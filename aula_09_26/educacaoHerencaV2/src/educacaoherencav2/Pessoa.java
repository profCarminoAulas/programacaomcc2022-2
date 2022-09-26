/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educacaoherencav2;

/**
 *
 * @author profj
 */
public class Pessoa {
    private String nome; 
    private int idade; 
    
    Pessoa(){
        
        System.out.println("criando pessoa");
    }
    
    Pessoa(String nome, int idade ){
        System.out.println(
                "nome " + nome + " idade " + idade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
