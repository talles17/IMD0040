

public class main 
{
	public static void main (String[] args)
		{

			ProfessorHorista prof1 = new ProfessorHorista("joao","1111",29,25,"17");
			System.out.println("O professor " + prof1.getNome() + " ganha " + prof1.salario() + " de salario.");
		}
}
