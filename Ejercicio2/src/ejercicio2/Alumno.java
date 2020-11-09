package ejercicio2;

public class Alumno 
{	public int programacion;
	public Byte sistemasInformaticos;
	public int lenguajeMarcas;
	
	public Alumno()//constructor metodo con el mismo nobre que la clase  
	{
		byte max=3-1;
		programacion=(int) (Math.random()*(max+1));
		sistemasInformaticos=20;
		lenguajeMarcas=(int) (Math.random()*(max+1));
	}
	public void mostrar() 
	{
		if(sistemasInformaticos==20) {
			System.out.println("P:"+ programacion+" SI:" + "no calificada" + " LM:"+lenguajeMarcas);
		}
		else if(programacion==20){
			System.out.println("P:"+ "no calificada"+" SI:" + sistemasInformaticos + " LM:"+lenguajeMarcas);
		}
		else if(lenguajeMarcas==20){
			System.out.println("P:"+ programacion+" SI:" + sistemasInformaticos + " LM:"+"no calificada");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno Alumno1= new Alumno();
		Alumno1.mostrar();
	}

}
