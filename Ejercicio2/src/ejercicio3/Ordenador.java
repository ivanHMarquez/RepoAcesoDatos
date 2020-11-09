package ejercicio3;

public class Ordenador {
	public String sistemaOperativo;
	public String fabricante;
	public byte RAM;
	
	public Ordenador(String s,String f) 
	{
		byte max=3;
		RAM = (byte) (Math.random()*(max+1));	
		switch (RAM) {
		case 0:RAM=8;break;
		case 1:RAM=16;break;
		case 2:RAM=32;break;
		case 3:RAM=64;break;
		};
		fabricante=f;
		sistemaOperativo=s;
	}
	public Ordenador(String f) 
	{
		byte max=3;
		RAM = (byte) (Math.random()*(max+1));	
		switch (RAM) {
		case 0:RAM=8;break;
		case 1:RAM=16;break;
		case 2:RAM=32;break;
		case 3:RAM=64;break;
		};
		fabricante=f;
		sistemaOperativo="Windows";
	}
	public void Mostrar() {
		
		System.out.println("Sistema Operativo:"+sistemaOperativo+" Fabricante:"+fabricante+" RAM:"+RAM);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenador ord1=new Ordenador("Linux","Dell");
		ord1.Mostrar();
		Ordenador ord2=new Ordenador("Dell");
		ord2.Mostrar();
		Ordenador ord3=new Ordenador("OS XD","Apelle");
		ord3.Mostrar();
		Ordenador ord4=new Ordenador("Toshiba");
		ord4.Mostrar();
	}

}
