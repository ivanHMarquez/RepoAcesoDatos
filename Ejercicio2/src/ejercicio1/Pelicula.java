package ejercicio1;

public class Pelicula {
	public int duracion;
	public String titulo;
	public String director;
	
	public Pelicula(String t,int d,String di) {
		duracion=d;
		titulo=t;
		director=di;
	}
	public void mostrar() {
		System.out.println("Titulo: " + titulo+"Duracion: "+duracion+"Director: "+director);

	}

	public static void main(String[] args) {
		Pelicula pelicula1 = new Pelicula ("El Señor de los Anillos ",180,"Peter Jackson");
		pelicula1.mostrar();
		Pelicula pelicula2 = new Pelicula ("Tiburón",120,"Steven Spielberg");
		pelicula2.mostrar();
	}

}
