/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author joa_o
 */
public class Conexao {
    
    public Connection conectaBD(){
        
        Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/acesso_usuario?user=root&password=";
            con = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Conexão" +  erro.getMessage());
        }
        return con;
    }
    
}
