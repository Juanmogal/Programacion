/* Realizar un programa que proporcione el cambio de Euros a distintas monedas según opción del usuario. 
 * El programa debe controlar todas las entradas y ofrecer al usuario la posibilidad de repetir o salir. 
 * ConversorMonedas.java
	
	ENTRADAS:Opción del menú y cantidad de euros a convertir
	SALIDAS:Menú y conversión a la moneda seleccionada
	RESTRICCIONES:La cantidad de euros debe ser mayor que 0
	
	
	
	
		PSEUDOCÓDIGO GENERALIZADO
			Inicio
				Leer y validar ejecutar
				Leer y validar respuesta ejecutar
				Mostrar menú
				Leer y validar opcion menu
					Si opcion menu !=s(salir)
						SEGUN
							CASO_A
								EUROS A DOLARES
							FIN_CASO_A
							CASO_B
								EUROS A YENS
							FIN_CASO_B
							CASO_C
								EUROS A LIBRAS
							FIN_CASO_C
						FIN_SEGUN
					FIN_Si
				Leer y validar seguir
			Fin
*/

import java.io.*;
import java.util.Scanner;

public class conversoreuros {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		double euro=0;
		double dolar=0;
		double yen=0;
		char opcionmenu;
		char respuestaejecutar;
		
		//Leer y validar ejecutar
			do{
				
				System.out.println("¿Quieres ejecutar el programa?"); 
				respuestaejecutar = Character.toUpperCase(teclado.next().charAt(0));
				
				}while(respuestaejecutar!= 'S' && respuestaejecutar!= 'N');
					
		//Leer y validar respuesta ejecutar
		
		do{
		System.out.println("----------CONVERSOR DE MONEDAS----------");
		System.out.println("                                          ");
		System.out.println("     A.Convierta de euros a dolares");
		System.out.println("                                          ");
		System.out.println("     B.Convierta de euros a yenes");
		System.out.println("                                           ");
		System.out.println("     C.Convierta de euros a libras");
		System.out.println("                                           ");
		System.out.println("Que opcion desea realizar?");
		System.out.println("                                           ");
	
	
	//Leer y validar opción menú
	
		opcionmenu = Character.toUpperCase(teclado.next().charAt(0));
		}while(opcionmenu=>'A') && (opcionmenu<='C');
	
	
					
	
		
		
		
		
	
}

		
	}
		
		
		
		
		
		
		
		
		




