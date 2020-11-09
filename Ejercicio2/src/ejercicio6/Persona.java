package ejercicio6;

public class Persona {
	public double altura;
	public static byte numPersonas;
	public static double totalAlturas;
	
	public Persona() {
		double max = 1.95;
		double min = 1.55;
		altura=(min+Math.random()*(min-max));
		numPersonas++;
		totalAlturas=totalAlturas+altura;
	}
	public void mostrar() {
		System.out.println("Altura:"+altura+" numero de personas:"+numPersonas+" alturas sumadas:"+totalAlturas);
		//el formato de las alturas no se como hacer que saga algo como 1.45 en vez de tantos decimales 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1= new Persona();
		p1.mostrar();
		Persona p2= new Persona();
		p2.mostrar();
		Persona p3= new Persona();
		p3.mostrar();
	}

}
