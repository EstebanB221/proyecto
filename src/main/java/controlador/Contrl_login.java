package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.Conexion;


public class Contrl_login {
    
   public boolean loginUser(Usuario objeto){
        
        
        boolean respuesta = false;
        Connection cn= Conexion.getConnection();
        String sql = "SELECT INTO usuario WHERE usuario= '" + objeto.getUsuario() + "' AND contrasena = '" +objeto.getContraseña()+ "'";
        Statement st;
        
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                respuesta = true;
            }
            
        }catch(SQLException e){
            System.out.println("error al conectar la base de datos, no se encuentra");
            JOptionPane.showMessageDialog(null, "error a inciiar sesion");
        }
        return respuesta;
    }

   
        
    
    
    
}