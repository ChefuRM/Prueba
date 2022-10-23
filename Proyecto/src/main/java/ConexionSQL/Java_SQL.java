/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chefu
 */
public class Java_SQL {

    Connection con = null;

    public static void main(String[] args) {

    }

    public Connection Conexion() {
        ResultSet result = null;

        String conexionSQL = "jdbc:sqlserver://DESKTOP-DO7VGP6\\SQLEXPRESS:1433;"
                + "database=Proyecto01;"
                + "user=sa;"
                + "password=1234;"
                + "loginTimeout=30;"
                + "encrypt=false;"
                + "trustServerCertificate=false;";

        try {
            Connection con = DriverManager.getConnection(conexionSQL);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Conexion Fallida!!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
