/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author paval
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese su nombre: "); // Se solicita al usuario que ingrese su nombre
        String nombre = scanner.nextLine(); // Se lee el nombre ingresado
        System.out.print("Ingrese su edad: "); // Se solicita al usuario que ingrese su edad
        int edad = scanner.nextInt(); // Se lee la edad ingresada
        System.out.print("Ingrese su numero de telefono: "); // Se solicita al usuario que ingrese su numero de telefono
        String telefono = scanner.next(); // Se lee el numero de telefono ingresado
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese su carrera: "); // Se solicita al usuario que ingrese su carrera
        String carrera = scanner.nextLine(); // Se lee la carrera ingresada
        int[] ascii = nombre.chars().toArray(); // Convierte el nombre a un arreglo de enteros que representan los valores ASCII de cada caracter
        float edad_float = (float) edad; // Convierte la edad a un número de punto flotante
        long telefono_long = Long.parseLong(telefono); // Convierte el número de teléfono a un número largo
        double telefono_double = Double.parseDouble(telefono); // Convierte el número de teléfono a un número de punto doble
        int telefono_int = Integer.parseInt(telefono); // Convierte el número de teléfono a un número entero
        System.out.print("El nombre en ASCII es: ");
        System.out.println(Arrays.toString(ascii));
        System.out.println("Su edad es: " + edad);
        System.out.println("Su edad como float es: " + edad_float);
        System.out.println("Su numero de telefono es: " + telefono);
        System.out.println("Su numero de telefono como long es: " + telefono_long);
        System.out.println("Su numero de telefono como double es: " + telefono_double);
        System.out.println("Su numero de telefono como int es: " + telefono_int);
        System.out.println("Su carrera es: " + carrera);
    }
    
}
