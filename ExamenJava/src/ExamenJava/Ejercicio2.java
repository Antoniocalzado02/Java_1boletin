package ExamenJava;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println(frecuenciaCardiaca(2022,"23/04/2002"));
		System.out.println(frecuenciaCardiaca(2022,"23/04/1991"));
		System.out.println(frecuenciaCardiaca(2022,"23/04/1998"));
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime tu fecha en formato dd/mm/yyyy");
		System.out.println(frecuenciaCardiaca(2022,String.valueOf(sc.next())));
		
		System.out.println("Dime el año en formato correcto yyyy");
		System.out.println("Dime tu fecha en formato dd/mm/yyyy");
		System.out.println(frecuenciaCardiaca(Integer.valueOf(sc.next()),String.valueOf(sc.next())));

	}
	
	public static int frecuenciaCardiaca(int anno, String fechaNac) {
		int totalFcm=0;
		String annoVacio="";
		
		annoVacio=annoVacio+fechaNac.substring(6);
		int annoEntero=Integer.parseInt(annoVacio);
		int totalannos=anno-annoEntero;
		
		totalFcm=220-totalannos;
		System.out.println("Este es tu fcm");
		return (totalFcm);

		}
	

}
