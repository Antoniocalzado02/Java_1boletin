package ExamenJava;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Que nota quieres introducir:");
		System.out.println(notaMusical(String.valueOf(sc.next())));

	}
	public static double notaMusical(String letrasMusical) {
		
		
		double notaTocada=0;
		String letraDo="do";
		String letraRe="re";
		String letraMi="mi";
		String letraFa="fa";
		String letraSol="sol";
		String letraLa="la";
		String letraSi="si";
		
		String letraDo2="do#";
		String letraRe2="re#";
		String letraMi2="mi#";
		String letraFa2="fa#";
		String letraSol2="sol#";
		String letraLa2="la#";
		String letraSi2="si#";
		
		
		letrasMusical=letrasMusical.toLowerCase();
		
		
		if (letrasMusical.equals(letraDo)){
			notaTocada=523.25; 
		}else if(letrasMusical.equals(letraRe)) {
			notaTocada=587.33;
		}else if(letrasMusical.equals(letraMi)) {
			notaTocada=659.26;
		}else if(letrasMusical.equals(letraFa)) {
			notaTocada=698.46;
		}else if(letrasMusical.equals(letraSol)) {
			notaTocada=783.99;
		}else if(letrasMusical.equals(letraLa)) {
			notaTocada=880;
		}else if(letrasMusical.equals(letraSi)) {
			notaTocada=987.77;
		}
		
		if (letrasMusical.equals(letraDo2)){
			notaTocada=523.25*1.03; 
		}else if(letrasMusical.equals(letraRe2)) {
			notaTocada=587.33*1.03;
		}else if(letrasMusical.equals(letraMi2)) {
			notaTocada=659.26*1.03;
		}else if(letrasMusical.equals(letraFa2)) {
			notaTocada=698.46*1.03;
		}else if(letrasMusical.equals(letraSol2)) {
			notaTocada=783.99*1.03;
		}else if(letrasMusical.equals(letraLa2)) {
			notaTocada=880*1.03;
		}else if(letrasMusical.equals(letraSi2)) {
			notaTocada=987.77*1.03;
		}
		
		
		
		return notaTocada;

	}
	

}
