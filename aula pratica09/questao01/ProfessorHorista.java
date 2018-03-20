public class ProfessorHorista extends Professor
{
	int total_horas;
	String salario_hora;

	public ProfessorHorista(String n, String m, int i,int th, String sh)
	{
		super(n,m,i);
		this.total_horas = th;
		this.salario_hora = sh;
	}

	public void setTotalHora(int th) 
	{
		this.total_horas = th;
	}

	public int getTotalHora() 
	{
		return this.total_horas;
	}

	public void setSalarioHora(String sh) 
	{
		this.salario_hora = sh;
	}

	public String getSalarioHora() 
	{
		return this.salario_hora;
	}		

	public double salario() 
	{	
		int salarioPorHora = Integer.parseInt(salario_hora);

		return total_horas * salarioPorHora;
	}

}