/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educacaoherencav2;

/**
 *
 * @author profj
 */
public class Aluno extends Pessoa {
    private int ra; 
    
    
    Aluno(){
        super("jose", 33); 
        System.out.println("criando aluno");
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
