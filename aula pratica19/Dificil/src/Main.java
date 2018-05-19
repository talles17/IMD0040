
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotaAluno a = new NotaAluno(213213, "aluno1", 10, 6, 4);
        NotaAluno b = new NotaAluno(123432, "aluno2", 5, 6, 3);
        NotaAluno c = new NotaAluno(864553, "aluno3", 9, 2, 7);
        NotaAluno d = new NotaAluno(129101, "aluno4", 2, 3, 7);
        NotaAluno e = new NotaAluno(124531, "aluno5", 7, 8, 4);
        
        List lista = new ArrayList();
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        
        Collections.sort(lista);
        
        System.out.println(lista.toString());
    }
    
}
