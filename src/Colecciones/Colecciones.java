package Colecciones;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class Colecciones {

    public static void main(String[] args) {
        
        
        //Declarando mi primer arreglo de Java []
        //Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, despues el nombre de mi arreglo y por ultimo instancio mi arreglo. Los datos que voy  guardar en este arreglo, van dentro de {}
        
        String[] listaCompras = new String[] {"leche", "pan", "frutas"};
        
        //Impresi[on de mi array
        System.out.println(listaCompras);

        
        //forEach para imprimir cada elemento de mi lista de compras
        
        //para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arrelgo llamado listaCompras, vas a imprimir ese productoTemporal
        for(String productoTemporal : listaCompras) {
            System.out.println(productoTemporal);
        }
        
        
    
        //Declaro mi arreglo de habitaciones de un hotel
        String[] habitaciones = new String[10];
        
        //Inicializo o asigno valores a cada indice
        habitaciones[0] = "101";
        habitaciones[1] = "102";
        habitaciones[2] = "103";
        habitaciones[3] = "104";
        habitaciones[4] = "105";
        habitaciones[5] = "106";
        habitaciones[6] = "107";
        habitaciones[8] = "109";
        habitaciones[9] = "110";
        
        
        
        //habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas alla de los elementos declarados al principio, tendremos una excepcion que solo veremos cuando se ejecute el programa/
        
        
        //Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a uno indefinido. 
        System.out.println(habitaciones[8]);
        
        
        //En caso de querer usar un foreach para imprimir los elementos, solo se imprimiran 7 elementos. (solo itera sobre los elementos existentes).
        
        for(String habitacionTemporal : habitaciones) {
            System.out.println(habitacionTemporal);
        }//for
        
        
        //ArrayList
        //Uso la interface list que almacena Cliente (objeto), se llama listaDeClientes e instancia un arrayList para manejar los mismos tipos de datos (Cliente)
        List<Cliente> listaDeClientes = new ArrayList<>();
        
        //Primero instancio un objeto de la clase cliente
        Cliente Felipe = new Cliente("Felipe MAqueda", "ABC123", 156.50f, "1234");     
        
        //Agrego el cliente a mi lista de clientes con el metodo .add
        listaDeClientes.add(Felipe);
        
        //Instancio al cliente y lo agrego a la lista
        listaDeClientes.add(new Cliente("Naruto", "XXX111", 100.00f, "0000"));
        
        System.out.println("Lista completa");

        //Imprimo la informacion de la lista (utilizar metodos)
        System.out.println(listaDeClientes);
        
        //Sacar un elemento de la lista
        System.out.println("Elemento en el indice 0");
        Cliente datoDeLaLista = listaDeClientes.get(0);
        
        System.out.println();

        System.out.println("Impresion de un elemento de la lista");
        //Imprimir el elemento de la lista con un dato especifico
        System.out.println(datoDeLaLista);
        
        System.out.println();
        //Eliminar elementos de la lista
        listaDeClientes.remove(0);
        
        System.out.println();
        //Imprimo la informacion de mi lista
        System.out.println(listaDeClientes);



        
        System.out.println(datoDeLaLista.getCuentaBancaria());
        
        //Conjunto para servicios de un hotel
        
        Set<String> roomService = new HashSet<>();
        
        roomService.add("Chilaquiles");
        roomService.add("Agua mineral");
        roomService.add("Wi-Fi");
        
        if(roomService.contains("Agua mineral")) {
        	System.out.println("Obtienes un descuento del 50%");
        }
        
        //Que pasa si imprimo mi roomService?
        //roomService.clear();
        System.out.println(roomService);

        //HashMap para el sistema de hotel
        Map<String, Cliente> reservaHabitacion = new HashMap<>();
        
        reservaHabitacion.put("101", new Cliente("Jesus", "125JJJ", 1890.87f, "0011"));
        reservaHabitacion.put("102", new Cliente("Bugs Bunny", "BGSB12", 10090.87f, "7777"));

        //Impresion de una reserva
        Cliente reservaBugsBunny = reservaHabitacion.get("102");
        
        //Que pasa si imprimo la variable reservaHabitacion
        System.out.println(reservaHabitacion);

        
    }//main

}//colecciones


/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 

- ArrayList

Es una implementacion de una coleccion llamada List (interface superior), y se utiliza mucho para almacenar elementos de una forma dinamica. Las principales caracteristicas de un ArrayList son:

	1.- Tamaño dinamico
	2.- Acceso rapido
	3.- Coste elevado 

- Set

Es una estructura de datos que almacena elementos unicos sin orden especifico. Las principales caracteristicas de un set son:

	1.- No hay elementos duplicados
	2.- No hay orden especifico
	3.- Busqueda es mas rapida (key-value)

- HashMAp

Es una implementacion de la interfaz Map de Java, que permite que la informacion se almacene en pares clave-valor. Sus principales características son:

	1.- Almacenamiento K y V
	2.- Sun orden especifico
	3.- Busqueda rapida
	4.- Interacion rapida (for each)
	5.- No sincronizado (hilos)

*/