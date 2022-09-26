/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educacaoheranca;

/**
 *
 * @author profj
 */
public class AlunoDeGraduacao extends Pessoa{
    private double nota1, nota2, notaFinal;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaFinal() {
        this.notaFinal = 
                (this.nota1 + this.nota2) /2;
        return notaFinal;
    }

    
}
