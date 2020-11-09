package programacion;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		long a=11111, b=22222, c=33333, d=44444;
		System.out.println("Numeros: "+a+" "+b+" "+c+" "+d);
		
		int e=5555, f=6666, g=7777,suma=e+f+g;		
		System.out.println("Numeros: "+e+" "+f+" "+g );
		System.out.println("Total: "+suma);
		
		double h=8888.77777, i=9999.88888, j=1000.99999, media=(h+i+j)/3;
		System.out.println("Numeros: "+h+" "+i+" "+j);
		System.out.println("Media: "+media);
		
		float k=143.111111f, l=144.222222f;
		
		if(k<l) 
		{
			System.out.println("Numeros de menor a mayor: "+k+" "+l);
		}
		else 
		{
			System.out.println("Numeros de menor a mayor: "+l+" "+k);
		}
		
		// ejercicio 5 indicar cual es mayor
		short n1=-10, n2=14, n3=99;
		 if( n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " es el mayor");
		 }

        else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + "  es el mayor");
        }

        else {
            System.out.println(n3 + "  es el mayor");
        }
	
		 if( n1 <= n2 && n1 <= n3) {
	            System.out.println(n1 + " es el menor");
			 }

	        else if (n2 <= n1 && n2 <= n3) {
	            System.out.println(n2 + "  es el menor");
	        }

	        else {
	            System.out.println(n3 + "  es el menor");
	        }
		
		
		
		//Ejercicio 6 numeros pares entre 20 y 200
		short m;
		System.out.print("numeros pares de 20 a 200: ");
		for(m=20;m<200;m+=2) {
			System.out.print(m+",");
		}
		//salto de linea
		System.out.println("\n");
		System.out.print("aleatorio hasta que salga 3: ");
		
		//Ejercicio 7 aleatorio hasta que salga 3 
		int max=3;
		int ale=0;
		while(!(ale==3))
		{
			ale = (int)(Math.random()*(max+1));
			System.out.print(ale+" ");
		}
		
		//ejercicio 8 aleatorio hasta menor de 5
		System.out.println("\n");
		System.out.print("aleatorio hasta que salga menor que 5: ");

		int nax=100;
		int nale=0;
		
		do{	
			nale = (int)(Math.random()*(nax+1));
			System.out.print(nale+" ");
		}while(!(nale<5));
		//salto de linea
				System.out.println("\n");
				
				
		//ejercicio 9 mayor o menor de		
		int numb=1000;
		int x= (int)(Math.random()*numb+1);
		if(x>500) {
			System.out.print("x es grande");
		}
		else if ((x<=500)&&(x>=200)) {
			System.out.print("x es mediano");
		}
		else if(x>200) {
			System.out.print("x es pequeño");
		}
		//salto de linea
		System.out.println("\n");
		
		
		//ejercicio 10
		byte xax=11;
		byte mes = (byte)(Math.random()*(xax+1));
		System.out.print("ha salido el mes: ");
		switch (mes) {							//if mes == 
		case 0 : System.out.print("Enero");break;	//0{ S.O.print enero}
		case 1 : System.out.print("Febrero");break;
		case 2 : System.out.print("Marzo");break;
		case 3 : System.out.print("Abril");break;
		case 4 : System.out.print("Mayo");break;
		case 5 : System.out.print("Junio");break;
		case 6 : System.out.print("Julio");break;
		case 7 : System.out.print("Agosto");break;
		case 8 : System.out.print("Septiembre");break;
		case 9 : System.out.print("Octubre");break;
		case 10 : System.out.print("Nobriembre");break;
		case 11 : System.out.print("Diciembre");break;
		}
		
		
		
		
		
		
		
		
	}

}
