
/**
 * Write a description of class Aluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aluno 
{
    // instance variables - replace the example below with your own
    private Prova prova1;
    private Prova prova2;

    /**
     * Constructor for objects of class Aluno
     */
    public Aluno(Prova p1 , Prova p2)
    {
        // initialise instance variables
        prova1 = p1;
        prova2 = p2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calcularMedia()
	{
		return (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2; 
	}
}
