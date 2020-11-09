package ejercicio7;

public class Aleatorios {
	public int aleatorio;
	public static int total;
	public static int contador;
	public static int mediaAleatorios;

	public Aleatorios() {
		int max = 20;
		int min = 10;
		aleatorio=(int)(min+Math.random()*(max-min+1));
		total= total +aleatorio;
		contador++;
		mediaAleatorios= total/contador;
	}
	public void mostrar() {
		System.out.println("Nº Aleatorio:"+aleatorio+" media de los aleatorios:"+mediaAleatorios+" cuantas veces se ha generado:"+contador);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aleatorios a1= new Aleatorios();
		a1.mostrar();
		Aleatorios a2= new Aleatorios();
		a2.mostrar();
		Aleatorios a3= new Aleatorios();
		a3.mostrar();
		Aleatorios a4= new Aleatorios();
		a4.mostrar();
	}

}
