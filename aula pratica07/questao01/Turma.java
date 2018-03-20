
/**
 * Write a description of class Turma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Turma 
{
    // instance variables - replace the example below with your own
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    /**
     * Constructor for objects of class Turma
     */
    public Turma(Aluno a1 , Aluno a2, Aluno a3)
    {
        // initialise instance variables
        aluno1 = a1;
        aluno2 = a2;
        aluno3 = a3;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calcularMedia()
    {
	double notaTotal = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
	return notaTotal/3; 
    }
      
    public void mostrarMediaDosAlunos()
    {
        System.out.println("Media do aluno 1: " + aluno1.calcularMedia());
        System.out.println("Media do aluno 2: " + aluno2.calcularMedia());
        System.out.println("Media do aluno 3: " + aluno3.calcularMedia());
        
    }
    
    public void mostrarMediaDaTurma()
    {
        System.out.println("Media da turma: " + calcularMedia());
    }
}
