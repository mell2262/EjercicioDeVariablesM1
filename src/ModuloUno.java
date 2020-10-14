
public class ModuloUno {

	public static void main(String[] args) {
		/*FASE 3
		 Partiendo del año 1948 tiene que hacer un bucle for y mostrar los años 
		bisiestos hasta llega a su año de nacimiento.
		 ATENCION! Deberá cambiar el tipo de variable de 1948 para poder modificarla.
		 Cree una variable bool que sera cierta si el año de nacimiento es bisiesto o 
		falsa si no lo es.
		 En caso de que la variable bool sea cierta, debe mostrar por consola una 
		frase donde lo diga, en caso de ser falsa mostraréis la frase pertinente. 
		Crea dos variables string para guardar las frases.

		*/
		
		String nombre="Melisa";
		String apellido1="Gomez";
		String cognom2="Gratia";
		
		int dia=14;
		int mes=10;
		double año=2020;
		
		System.out.println(apellido1+" "+cognom2+" "+nombre);
		System.out.println(dia+"/"+mes+"/"+año);
		//--------------------------------------------------------------//
		final double BISIESTO=1948;
		int contBisiesto=4;
		
		double result=Math.floor((año-BISIESTO)/contBisiesto);
		System.out.println(result);
		//-------------------------------------------------------------//
		String bisiestoTrue="es año bisiesto";
		String bisiestoFalse="el año no es bisiesto";

		for (double i=BISIESTO; i<=año; i++) {
			boolean calcBisiesto;
			
			if ((((año-i)/contBisiesto)%1)!=0) calcBisiesto=false;
			else calcBisiesto=true;
			
			if (calcBisiesto==true) System.out.println((int)i+" "+bisiestoTrue);
			else System.out.println(bisiestoFalse);
		}
		
	}

}
