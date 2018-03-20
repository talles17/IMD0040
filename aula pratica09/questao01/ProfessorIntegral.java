public class ProfessorIntegral extends Professor
{
	private double salario;

	public ProfessorIntegral(String n, String m, int i, double s) 
	{
		super(n,m,i);
		this.salario = s;
	}

	public void setSalario(double s) 
	{
		this.salario = s;
	}

	public double getSalario() 
	{
		return this.salario;
	}


}