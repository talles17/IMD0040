
/**
 * Write a description of class Prova here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prova
{
    // instance variables - replace the example below with your own
    private double notaParte1;
    private double notaParte2;

    /**
     * Constructor for objects of class Prova
     */
    public Prova(double nota1,double nota2)
    {
        // initialise instance variables
        notaParte1 = nota1;
        notaParte2 = nota2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calcularNotaTotal() 
	{
		return notaParte1 + notaParte2;
	}
}
