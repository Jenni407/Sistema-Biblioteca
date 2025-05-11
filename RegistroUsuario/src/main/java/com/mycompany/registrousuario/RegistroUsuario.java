/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrousuario;
   import java.util.Scanner;
/**
 *
 * @author Administrador
 */
        
     

public class RegistroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese password: ");
        String password = scanner.nextLine();

        System.out.println("Usuario registrado exitosamente.");
        System.out.println("Nombre de usuario: " + usuario);
    }
}
