/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talles
 */
public class NotaAluno implements Comparable<NotaAluno> {
    private int matricula;
    private String nomeAluno;
    double nota1;
    double nota2;
    double nota3;
    
    public NotaAluno(int matricula, String nomeAluno, double n1, double n2, double n3) {
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public double getMedia() {
        return (nota1+nota2+nota3)/3;
    }
    
    @Override
    public int compareTo(NotaAluno a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.getMedia() < a.getMedia()) {
            return -1;
        }
        else if (a.getMedia() <= this.getMedia()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "NotaAluno{" + "matricula=" + matricula + ", nomeAluno=" + nomeAluno + '}';
    }
    
    
}
