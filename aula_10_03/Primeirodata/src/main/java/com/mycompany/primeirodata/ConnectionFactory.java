/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirodata;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author profj
 */
public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "anima123";
    private String host = "localhost";
    private String porta = "8080";
    private String bd = "db_pessoas";

    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta +
                            "/" + bd +
                            "?useTimezone=true&serverTimezone=UTC",
                    usuario,
                    senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
