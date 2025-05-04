package Actividad;


public class Tarea {
	private String titulo;//elementos dados en la guia
	private int prioridad;

	public Tarea(String titulo, int prioridad) {//constructor
		this.titulo=titulo;
		this.prioridad=prioridad;
	}

	public String getTitulo() {//getters de titulo y prioridad para obtener sus valores
		return titulo;
	}

	public int getPrioridad() {
		return prioridad;
	}

	@Override
	public String toString() {
		return "Tarea = "+"titulo: "+titulo+" prioridad: "+prioridad;//Estos nos mostraria esto por pantalla: "Tarea = titulo: titulo1 prioridad: 1"
		//pero es un metodo que se puede sobreesceibir dependiendo a lo que queramos mostrar 
	}

	

	@Override

	public boolean equals(Object objeto) {//Object es una superclase ya definida en java, y que hace que equals actue de esa manera (es un metodo de Object)
		if (this == objeto) return true; //
        if (!(objeto instanceof Tarea)) return false;
        Tarea other = (Tarea) objeto;
        return titulo.equals(other.titulo) && prioridad == other.prioridad;
	}
}