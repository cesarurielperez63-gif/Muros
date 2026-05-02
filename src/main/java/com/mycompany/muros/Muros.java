/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.muros;

/**
 *
 * @author HP
 */
public class Muros {


    public static void main(String[] args) {
        
        System.out.println("--- INICIANDO PRUEBAS DEL SISTEMA SCEA ---");

        // 1. Instanciar y probar la clase de matemáticas
        System.out.println("\n1. PRUEBA DE CUANTIFICACIÓN DE MAMPOSTERÍA:");
        
        // Simular los datos que un usuario escribiría:
        // Muro de 5.0m x 2.5m, Block de 40.0cm x 20.0cm, Junta de 1.5cm
        CuantificacionMamposteria calculo = new CuantificacionMamposteria(5.0, 2.5, 40.0, 20.0, 1.5);
        
        // Ejecutar los métodos y mostrar los resultados en consola
        System.out.println("Área del muro: " + calculo.calcularAreaMuro() + " m2");
        System.out.println("Total de piezas necesarias: " + calculo.calcularTotalPiezas() + " blocks");
        System.out.println("Volumen de mortero estimado: " + calculo.calcularVolumenMortero() + " m3");

        // 2. Probar la conexión a MariaDB
        System.out.println("\n2. PRUEBA DE CONEXIÓN A BASE DE DATOS:");
        
        // Llamar al método estático de la clase ConexionBD
        // Asegúrate de que XAMPP (MySQL) esté encendido y el archivo .jar esté en Libraries
        ConexionBD.conectar();
        
        System.out.println("\n--- FIN DE LAS PRUEBAS ---");
    }
}

