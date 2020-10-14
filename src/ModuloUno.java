
public class ModuloUno {

	public static void main(String[] args) {
		/*Cree una variable donde juntos el nombre y los apellidos (todo en una variable)
		 *  y otro donde juntos la fecha de nacimiento separada por "/" 
		 *  (todo en una variable). 
		 *  Muestre por consola las variables del nombre completo,
		 *  la fecha de nacimiento y si el año de nacimiento es de traspaso o no.

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
		String bisiestoFalse="no es año bisiesto";

		for (double i=BISIESTO; i<=año; i++) {
			boolean calcBisiesto;
			if ((((año-i)/contBisiesto)%1)!=0) calcBisiesto=false;
			else calcBisiesto=true;
			
			if (calcBisiesto==true) System.out.println((int)i+" "+bisiestoTrue);
			else System.out.println(bisiestoFalse);
		}
		//------------------------------------------------------------//
		String nombreCompleto=(nombre+" "+apellido1+" "+cognom2);
		String fechaNacimiento=(dia+"/"+mes+"/"+(int)año);
		String esNoEsBisiesto;

		if ((((año-BISIESTO)/contBisiesto)%1)!=0) esNoEsBisiesto=bisiestoFalse;
		else esNoEsBisiesto=bisiestoTrue;
		System.out.println("Mi nombre es "+ nombreCompleto);
		System.out.println("Naci el "+fechaNacimiento);
		System.out.println("Mi año de nacimiento "+esNoEsBisiesto);
	}

}
