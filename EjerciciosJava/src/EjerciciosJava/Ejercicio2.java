package EjerciciosJava;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println(cifradoPalabra("HOLA",2));
		
		
	}
	public static String cifradoPalabra(String cadena,int posicion) {
		
		StringBuilder sb = new StringBuilder();
		cadena=cadena.toLowerCase();
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		
		for(int i=0; i<cadena.length(); i++) {
			for(int h=0; h<abecedario.length(); h++) {
				if(cadena.charAt(i)==abecedario.charAt(h)) {
					sb.append(abecedario.charAt(h+posicion));
				}
			}
		}
		
		
		
		
		
		return sb.toString();
	}

}
