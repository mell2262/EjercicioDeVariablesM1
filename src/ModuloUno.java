
public class ModuloUno {

	public static void main(String[] args) {
		/*FASE 2
		 Sabiendo que en 1948 es un año bisiesto:
		 Cree una constante con el valor del año (1948).
		 Cree una variable que guarde cada cuando hay un año bisiesto.
		 Calcular cuantos años bisiestos hay entre 1948 y su año de nacimiento y 
		almacene el valor resultante en una variable.
		 Muestre por pantalla el resultado del cálculo.

		*/
		
		String nombre="Melisa";
		String apellido1="Gomez";
		String cognom2="Gratia";
		
		int dia=14;
		int mes=10;
		int año=2020;
		
		System.out.println(apellido1+" "+cognom2+" "+nombre);
		System.out.println(dia+"/"+mes+"/"+año);
		//--------------------------------------------------------------//
		final int BISIESTO=1948;
		int contBisiesto=4;
		
		double result=Math.floor((año-BISIESTO)/contBisiesto);
		System.out.println(result);
		
	}

}
