/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Erika
 */
public class conexionSQL {
    
    Connection conectar=null;
    private Component Null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
           
                        
            JOptionPane.showMessageDialog(Null, "Conexion Exitosa");
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(Null, "Error de Conexion" + e.getMessage());
        }
        
        return conectar;
    }
}
