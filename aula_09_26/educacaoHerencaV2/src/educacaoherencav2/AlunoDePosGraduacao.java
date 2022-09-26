/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educacaoherencav2;

/**
 *
 * @author profj
 */
public class AlunoDePosGraduacao extends Aluno {
    private char conceito; 
    
    AlunoDePosGraduacao(){
        System.out.println("criando aluno de pós graduação");
    }
    
    public char getConceito() {
        return conceito;
    }

    public void setConceito(char conceito) {
        this.conceito = conceito;
    }
    
}
