package ejercicio4;

public class Pais 
{
	public String capital;
	public int poblacion;  
	
	public Pais(int p)
	{	
		byte max = 3;
		byte ale = (byte) (Math.random()*(max+1));
		switch (ale){	
		case 0:capital="Roma";break;
		case 1: capital="Berlin";break;
		case 2: capital="Tokyo";break;
		case 3: capital="Buenos Aires";break;
	}	
		
		poblacion=p;
		
	}
	public Pais(String c)
	{	
		capital=c;
		byte max=10;
		poblacion= (byte) (Math.random()*(max+1));
	}
	
	public void Mostrar()
	{	
		
		System.out.println("Capital "+capital+" Poblacion:"+poblacion+" Millones");
	}

	public static void main(String[] args) 
	{	Pais p1 = new Pais(5);
		p1.Mostrar();
		Pais p2 = new Pais("Madrid");
		p2.Mostrar();
		Pais p3 = new Pais(700);
		p3.Mostrar();
		Pais p4 = new Pais("Paris");
		p4.Mostrar();
	}
}
