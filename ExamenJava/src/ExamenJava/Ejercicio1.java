package ExamenJava;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double totalEntrada=0;
		
		System.out.println("Tienes tarjeta para el cine S o N");
		String tarjetaCine=String.valueOf(sc.next());
		
		
		System.out.println("Dime el numero de personas");
		double numeroEntradas= Integer.valueOf(sc.next());
		double diaNormal=8;
		
		System.out.println("Dime el dia de la semana");
		double diaSemana=Integer.valueOf(sc.next());
		
		
		while (numeroEntradas>0){
			if (diaSemana==1 || diaSemana==2 || diaSemana==5 || diaSemana==6 || diaSemana==7){  
				totalEntrada=numeroEntradas*8;
			}else if(diaSemana==3){
				totalEntrada=numeroEntradas*5;
			}else if(diaSemana==4) {
				totalEntrada=numeroEntradas*5.5;
				if (numeroEntradas%2!=0) {
					numeroEntradas=numeroEntradas-1;
					totalEntrada=numeroEntradas*5.5;
					totalEntrada=totalEntrada+diaNormal;
				}
				
				
			}
		
			
			if (tarjetaCine=="S"){
				totalEntrada=(totalEntrada*90)/100;
		}
			System.out.println(totalEntrada + " Este es el total de las entradas");
			
			System.out.println("Tienes tarjeta para el cine S o N");
			tarjetaCine=String.valueOf(sc.next());
			
			while (tarjetaCine=="S" || tarjetaCine=="N") {
				System.out.println("Tienes tarjeta para el cine S o N");
				tarjetaCine=String.valueOf(sc.next());
			}
			System.out.println("Dime el dia de la semana");
			diaSemana=Integer.valueOf(sc.next());
			
			while (diaSemana<=0 || diaSemana>7 ) {
			
				System.out.println("Dime el dia de la semana");
				diaSemana=Integer.valueOf(sc.next());
			
			}
			
			
			System.out.println("Dime el numero de personas");
			numeroEntradas= Integer.valueOf(sc.next());
			diaNormal=8;
			
			
			
		}
		
		
		}
		
		
		
	
		
		
		

	}
	


