/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservalibro;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */

public class ReservaLibro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese nombre del libro a reservar: ");
        String libro = scanner.nextLine();

        System.out.println("Reserva ingresada para el libro: " + libro);
        System.out.println("Se le notificara cuando este disponible.");
    }
}
