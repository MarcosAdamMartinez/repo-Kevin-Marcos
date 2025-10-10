package accesoADatos.pruebasAPIStream;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private int dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	
	public Persona(int dni, String nombre, String apellidos, LocalDate fechaNac) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public int edad() {
	    LocalDate hoy = LocalDate.now();
	    return Period.between(this.fechaNac, hoy).getYears();
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac
				+ "]\n";
	}
	

}
