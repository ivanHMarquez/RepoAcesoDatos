package ejercicio8;

public class Asignatura {
	public int numAlumnos;
	public String nombre;
	public static int mediaAlumnos;
	public static int nClases;
	public static int totalAlumnos;
	
	public Asignatura(String n) {
		nombre=n;
		int max = 30;
		int min = 15;
		numAlumnos=(int)(min+Math.random()*(max-min+1));
		nClases++;
		totalAlumnos=totalAlumnos+numAlumnos;
		mediaAlumnos=totalAlumnos/nClases;
	}

	public void mostrar() {
		System.out.println("Nombre asignatura:"+nombre+" \tNº de alumnos:"+numAlumnos+" \tmedia de alumnos por clase:"+mediaAlumnos);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura a1 = new Asignatura("Matematicas");
		a1.mostrar();
		Asignatura a2 = new Asignatura("Lengua");
		a2.mostrar();
		Asignatura a3 = new Asignatura("Ciencias sociales");
		a3.mostrar();
		Asignatura a4 = new Asignatura("Biologia");
		a4.mostrar();
	}

}
