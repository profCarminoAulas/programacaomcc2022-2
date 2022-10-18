/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylist;

/**
 *
 * @author profj
 */
public class Cliente {
    public String Nome;
    public String Endereco;
    public String Telefone; 

    Cliente(String nome, 
            String endereco,
            String telefone ){
        this.Nome = nome; 
        this.Endereco = endereco; 
        this.Telefone = telefone; 
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
}
