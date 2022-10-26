/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10518083;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Lenovo
 */
public class koneksi {
    private static final String host = "localhost";
    private static final String db = "perpus_10518083";
    private static final String user = "root";
    private static final String pass = "";
    private static Connection conn;
    
public static Connection getConnection(){
    if(conn==null){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://"+host+"/"+db,user,pass);
                    }
        catch(SQLException ex){
            System.out.println("koneksi Gagal"+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    return conn;
    }
}  

