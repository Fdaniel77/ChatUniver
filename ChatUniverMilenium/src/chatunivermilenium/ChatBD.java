/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatunivermilenium;

/**
 *
 * @author daniel
 */
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class ChatBD {

    public Connection getConexion(){
        Connection cn=null;
        try{
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ChatUniver?autoReconnect=true&useSSL=false","root","daniel77");
        System.out.println("Existe conexion");
        }
        catch (SQLException e){
            System.out.println("No existe conexion");
        }
        finally {
            return cn;
        }
    }

    public boolean userLogin(String email, String pass) {
        Connection cn=getConexion();
        Statement st=null;
        ResultSet rs=null;
        String consulta = "SELECT idUser FROM User WHERE  email='"+email+"' AND pass='"+pass+"'";

        try {
            st=cn.createStatement();
            rs=st.executeQuery(consulta);
            if (rs.next()){
                return true;
            }
            cn.close();
        }
        catch (SQLException e){
        }
        return false;
    }
    
    public boolean consultaEmail(String email){
        Connection cn = getConexion();
        Statement st = null;
        ResultSet rs = null;
        String consulta = "SELECT * FROM User WHERE email = '"+email+"' ";
        try{
            st = cn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next()){
                return true;
            }cn.close();
        }catch(SQLException e){
        }
        return false;
    }
    
    public boolean confirmacionPass(String pass1, String pass2){
        if(pass1.equals(pass2)){
            return true;
        }else{
            return false;
        }
    }
}

