/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirodata;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author profj
 */
public class Pessoa {
    private String nome;
    private String fone;
    private String email;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public void inserir() {
        //1: Definir o comando SQL
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
//5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
