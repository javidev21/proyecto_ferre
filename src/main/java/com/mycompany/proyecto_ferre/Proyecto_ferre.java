/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_ferre;

import java.sql.Connection;
/**
 *
 * @author javier
 */
public class Proyecto_ferre {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Connection con = Conexion.conectar();
        
        if (con != null) {
            System.out.println("Prueba superada");
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    }
}
