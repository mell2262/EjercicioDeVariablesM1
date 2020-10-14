
public class ModuloUno {

	public static void main(String[] args) {
		/*FASE 1
		 Crear tres variables string y inicialitzales con los datos pertinentes 
		(nombre, apellido1, cognom2).
		 Crear tres variables int y inicialitzales con los datos pertinentes 
		(día, mes, año).
		 Muestra por pantalla las variables string concatenando-en este orden 
		(apellido1 + cognom2, + nombre).
		 Muestra por pantalla las variables int concatenando-con "/" 
		entre cada una de ellas.

		*/
		
		String nombre="Melisa";
		String apellido1="Gomez";
		String cognom2="Gratia";
		
		int dia=14;
		int mes=10;
		int año=2020;
		
		System.out.println(apellido1+" "+cognom2+" "+nombre);
		System.out.println(dia+"/"+mes+"/"+año);
	}

}
