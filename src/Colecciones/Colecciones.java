package Colecciones;

import java.util.Set;
import java.util.HashSet;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaro mi primer arreglo de java
		//Primero el tipo de dato que voy a almacenar, le congo corchetes, despues el nombre de mi arreglo y por ultimo instancio
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
		
		//forEach
		
		//Para nuestros datos del tipo String, que se almacenan en una variable temporal llamada productoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for(String productoTemporal : listaCompras) {
		System.out.println(productoTemporal);
		}
		
		//Arreglo de habitaciones
		String[] habitaciones = new String[10];
		
		//Asigno valores a cada indice
		habitaciones[0]="101";
		habitaciones[1]="102";
		habitaciones[2]="103";
		habitaciones[3]="104";
		habitaciones[4]="105";
		habitaciones[5]="106";
		habitaciones[6]="107";
		
		/*
		 * habitaciones[10]="111"; si tratamos de acceder a un elemento mas alla de los elementos declarados al principiotendremos una excepcion que solo veremos cuando se ejecute el programa
		 */

System.out.println(habitaciones[8]);

for(String habitacionTemporal : habitaciones) {
	System.out.println(habitacionTemporal);
}

	}

}

/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 



*/