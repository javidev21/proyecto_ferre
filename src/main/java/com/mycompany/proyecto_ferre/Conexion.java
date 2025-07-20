/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ferre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author javier
 */
public class Conexion {
    private static final String URL = "jdbc:postgresql://dpg-d1tei6jipnbc73c8huo0-a.oregon-postgres.render.com/bd_inventory";
    private static final String USER= "bd_inventory_user";
    private static final String PASSWORD = "Pngs3C2kGYjRqMsxo50DoVfkz6DVa1Qm";
    
    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
           // JOptionPane.showMessageDialog(null, "Conexion exitosa");
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            //JOptionPane.showMessageDialog(null, "Conexion fallida");

        }
        return conn;
    }
}
