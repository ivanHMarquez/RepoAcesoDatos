package ejercicio5;

public class Autobus {
	public int numLinea;
	public int matricula;
	public static int numAutobuses;
	
	public Autobus(int m){
		byte max = 100;
		byte min = 1;
		numLinea= (int) (min+(Math.random()*(max-min+1)));
		matricula=m;
		numAutobuses++;
	}
	public void mostrar() {
		System.out.println("numero de linea:"+numLinea+" matricula:"+matricula+" numero de autobuses:"+numAutobuses);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autobus a1=new Autobus(88556325);
		a1.mostrar();
		Autobus a2=new Autobus(8853325);
		a2.mostrar();
		Autobus a3=new Autobus(4596325);
		a3.mostrar();
	}

}
