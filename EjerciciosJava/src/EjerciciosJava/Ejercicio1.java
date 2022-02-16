package EjerciciosJava;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(obtenerCaracteres("Juanmanuel",false));

	}
	
	
	public static String obtenerCaracteres(String cadenaDeTexto,boolean numeroPar) {
	
		String cadenaVacia="";
		
		
		
		for (int i=0; i<cadenaDeTexto.length(); i++) {
			if(i%2==0) {
				if (numeroPar==true) {
					cadenaVacia=cadenaVacia+cadenaDeTexto.charAt(i);
				}
				
			}else if(numeroPar==false){
				cadenaVacia=cadenaVacia+cadenaDeTexto.charAt(i);
			}
		}
		
		
		
		
		return cadenaVacia;

	}

}
