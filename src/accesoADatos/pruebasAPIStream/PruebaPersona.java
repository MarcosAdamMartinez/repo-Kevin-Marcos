package accesoADatos.pruebasAPIStream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PruebaPersona {

	public static void main(String[] args) {
		List<Persona> cientificos = new ArrayList<Persona>();
		
		cientificos.add(new Persona(111111111,"Ada","Lovelace",LocalDate.of(1875,10,11)));
		cientificos.add(new Persona(222222222, "Albert", "Einstein", LocalDate.of(1879, 3, 14)));
		cientificos.add(new Persona(333333333, "Marie", "Curie", LocalDate.of(1867, 11, 7)));
		cientificos.add(new Persona(444444444, "Isaac", "Newton", LocalDate.of(1643, 1, 4)));
		cientificos.add(new Persona(555555555, "Nikola", "Tesla", LocalDate.of(1856, 7, 10)));
		
		System.out.println(cientificos);
		
		boolean todosSonMayoresDeEdad = todosTienenEdadSuperiorA(18, cientificos);
		System.out.println(todosSonMayoresDeEdad);
	}

	public static boolean todosTienenEdadSuperiorA(int edad, List<Persona> personas) {
		
		return personas.stream().allMatch(persona -> persona.edad() > edad);
		
	}
	
}