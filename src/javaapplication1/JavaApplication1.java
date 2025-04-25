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
        int edad = scanner.nextInt();
        System.out.print("Ingrese su numero de telefono: ");
        String telefono = scanner.next();
        scanner.nextLine();
        System.out.print("Ingrese su carrera: ");
        String carrera = scanner.nextLine();
        //pasa la variable nombre a ascii sin usar bucles y guardas los varoles en un arreglo
        int[] ascii = new int[nombre.length()];
        for (int i = 0; i < nombre.length(); i++) {
            ascii[i] = (int) nombre.charAt(i);
        }
        //imprime el arreglo ascii
        System.out.print("El nombre en ascii es: ");
        for (int i = 0; i < ascii.length; i++) {
            System.out.print(ascii[i]);
            if (i != ascii.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("Su edad es: " + edad);
        System.out.println("Su numero de telefono es: " + telefono);
        System.out.println("Su carrera es: " + carrera);
    }
    
}
