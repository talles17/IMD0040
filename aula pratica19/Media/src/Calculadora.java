
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talles
 */
public class Calculadora implements Calculavel {
    Stack pilha;
    
    public Calculadora() {
        pilha = new Stack();
    }
    
    @Override
    public float somar(float a, float b) {
        pilha.push(a + b);
        return a + b;
    }
    
    @Override 
    public float subtrair (float a, float b) {
        pilha.push(a - b);
        return a - b;
    }
    
    @Override
    public float dividir(float a, float b) {
        pilha.push(a / b);
        return a/b;
    }
    
    @Override
    public float multiplicar(float a, float b) {
        pilha.push(a * b);
        return a * b;
    }
    
    public void exibirResultados() {
        System.out.print("Resultados: ");
        while(!pilha.empty()) {
            System.out.println(pilha.pop());
        }
    }

    public void calcula() {
    	int operacao = 10;
	    float a, b;
    	while (operacao != 0) {
    		System.out.println("Qual operação voce deseja fazer ?");
	    	System.out.println("(1) Soma.");
	    	System.out.println("(2) Subtração.");
	    	System.out.println("(3) Divição.");
	    	System.out.println("(4) Multiplicação.");
	    	System.out.println("(0) Sair.");
	    	operacao = entrada.nextInt();
	    	
	    	switch (operacao) {
	    	case 0:
	    		break;
	    	case 1:	
	    		System.out.println("1 numero: ");
	    		a = entrada.nextFloat();
	    		System.out.println("2 numero: ");
	    		b = entrada.nextFloat();
	    		somar(a, b);
	    		break;
	    	
	    	case 2:
	    		System.out.println("1 numero: ");
	    		a = entrada.nextFloat();
	    		System.out.println("2 numero: ");
	    		b = entrada.nextFloat();
	    		subtrair(a, b);
	    		break;
	    	
	    	case 3:
	    		System.out.println("1 numero: ");
	    		a = entrada.nextFloat();
	    		System.out.println("2 numero: ");
	    		b = entrada.nextFloat();
	    		dividir(a, b);
	    		break;
	    	
	    	case 4:
	    		System.out.println("1 numero: ");
	    		a = entrada.nextFloat();
	    		System.out.println("2 numero: ");
	    		b = entrada.nextFloat();
	    		multiplicar(a, b);
	    		break;
	    	default:
	    		System.out.println("Comando invalido.");
	    	}
    	}
    	exibirResultados();
    }
}

}
