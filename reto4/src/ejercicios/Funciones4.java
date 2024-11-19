package ejercicios;

import java.util.Scanner;


import util.Funciones;

public class Funciones4 {
	
	// crear un menu que podamos introducir dos numeros y seleccionando una de las operaciones nos devuelva el resultado 
	public static void menu(Scanner sc){
		int opcion = 0;
		do {
		System.out.println("Selecciona una opcion:");
			System.out.println("1. media");
			System.out.println("2. suma");
			System.out.println("3. resta");
			System.out.println("0. salir");
			
			int num=Funciones.esInt("Opcion");
			switch(num) {
			case 1:
				double media= Funciones.dimeDouble("muestra media  ", sc);
				System.out.println(Funciones.dimeDouble(media));
				break;
			case 2:
				double suma=Funciones.dimeDouble("muestra suma", sc);
				System.out.println(Funciones.dimeEntero(suma, sc));
				break;
				
			case 3:
			double resta=Funciones.dimeDouble("muestra suma", sc);
			System.out.println(Funciones.dimeEntero(resta, sc));
			break;
			}
		
		}while (opcion != 0 );
	}
	
			
	
	public static double media(double n) {
		return media + 1.609 / 2;
	}

	public static int suma (double i) {
		return n + i;
	}
	
	public static int resta (double i) {
		return n - i;
	}
}

