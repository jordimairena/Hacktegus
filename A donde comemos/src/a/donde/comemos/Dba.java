/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.donde.comemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author jordi
 */
public class Dba {
    private String base_datos;
    private Connection dbcon;
    public Statement query;
    
    public Dba(String base_datos){
        this.base_datos=base_datos;
    }

    public void setBase_datos(String base_datos) {
        this.base_datos = base_datos;
    }        
    
   public void conectar(){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String driver = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};";
            driver += "DBQ=" + base_datos;
            dbcon = DriverManager.getConnection(driver, "", "");
            query = dbcon.createStatement();
            System.out.println("SE AH CONECTADO LA BASE DE DATOS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void desconectar() {
        try {
            query.close();
            dbcon.close();
        } catch (Exception e) {
        }
    }
    

    
}
