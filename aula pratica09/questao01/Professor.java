public class Professor 
{
	private String nome;
	private String matricula;
	private int idade;

	public Professor(String n, String m, int i)
	{
		this.nome = n;
		this.matricula = m;
		this.idade = i;
	}

	public void setNome(String n) 
	{
		this.nome = n;
	}

	public String getNome() 
	{
		return this.nome;
	}

	public void setMatricula(String m) 
	{
		this.matricula = m;
	}

	public String getMatricula() 
	{
		return this.matricula;
	}

	public void setIdade(int i) 
	{
		this.idade = i;
	}

	public int getIdade() 
	{
		return this.idade;
	}

	public static void main (String[] args)
	{

		ProfessorHorista prof1 = new ProfessorHorista("joao","1111",29,25,"17");
		System.out.println("O professor " + prof1.getNome() + " ganha " + prof1.salario() + " de salario.");
	}

}