package aula5;

// CRUD

import java.util.ArrayList;
//ArrayList
public class Principal {

	public static void main(String[] args) {
		ArrayList<String> disciplinas = new ArrayList<String>();
//adicionar variavel		
		disciplinas.add("calculo II");
		disciplinas.add("algébra linear");
		disciplinas.add("Circuitos eletricos");
		disciplinas.add("calculo III");
		
		System.out.println(disciplinas);
//get
		System.out.println(disciplinas.get(2));
//set
		disciplinas.set(3, "calculo IV");
		System.out.println(disciplinas);
//remove		
		disciplinas.remove(2);
		System.out.println(disciplinas);
//repetição		
		for(int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(1));

		}
//verdadeiro ou falso
		
	}

}
