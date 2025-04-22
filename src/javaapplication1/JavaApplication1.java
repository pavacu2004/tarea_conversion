/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author paval
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        Integer edad = scanner.nextInt();
        String edadString = edad.toString();
        System.out.print("Ingrese su numero de telefono: ");
        String telefono = scanner.next();
        System.out.print("Ingrese su carrera: ");
        String carrera = scanner.nextLine();
        System.out.print(nombre + " " + edadString + " " + telefono + " " + carrera);
    }
    
}
