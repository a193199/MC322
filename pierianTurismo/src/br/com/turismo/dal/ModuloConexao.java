/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.dal;

import java.sql.*;

/**
 * Módulo de conexão com o banco de dados
 *
 * @author analu
 * @version 1.1
 */
public class ModuloConexao {

    /**
     * método responsável pela conexão com o banco de dados
     *
     * @return conexão
     */
    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // chamando o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
//        String url = "jdbc:mysql://<<<substituir esse campo pela url que hospeda o banco de dados>>>>:3306/dbinfox";
        String user = "root";
        String password = "Palmeirascamp1";
        //conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //retornando o erro de conexão com o banco de dados
//            System.out.println(e
            return null;
        }
    }
}
