/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author kevin
 */
public class Conexion {
    
     public static Connection getConexion() throws SQLException
    {
                              //parametros para establecer la conexion 
                                     //parametros para establecer la conexion 
        String cadenaConexion = "jdbc:sqlserver://localhost:1433;" + //controlador jdbc, servidor y sus puertos
                                "database=AEROLINEA1;"+//Base de datos a usar 
                                "user=kevin123;"+//usuario de conexion a sql 
                                "password=kevin123;"+//clave de conexion a sql     
                                "encryption=true;"+//conexion encriptada
                                "trustServerCertificate=true;";//certificado de confianza 
        try {
            //Establecer una conexion con los parametros datos
            Connection con = DriverManager.getConnection(cadenaConexion);
            return con;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    } 
     
       public static Vuelos obtenerVuelo(String Id)throws SQLException{
                 try {
            //declarar la conexion a sql server
            Statement sql = (Statement) Conexion.getConexion().createStatement();
            //variable con la sentencia o script sql
             String Consulta = " select *  " +
                               " From Vuelo " +
                               " Where ID_Vuelo = " + Id;
         //Ejecutar la consulta t llenar una estructura con el o los resultados obtenidos 
         ResultSet rs = sql.executeQuery(Consulta);
         
         Vuelos Encontrado = new Vuelos();
         while (rs.next()){
             //resultado = Integer.valueOf(rs.getString(1));//es mejor este 
             //resultado= (rs.getInt(1)) + 1;//este es bueno pero
             Encontrado.setIdVuelo(rs.getInt(1));
             Encontrado.setCodigoVuelo(rs.getString(2));
            
         }
            return Encontrado;
                
        }catch(SQLServerException e){
                 JOptionPane.showMessageDialog(null, e.toString());
                         return null;
                        
                        }
    
         
     
     }
       
    public static ResultSet listarVuelos() throws SQLException{
                       try {
            //declarar la conexion a sql server
            Statement sql = (Statement) Conexion.getConexion().createStatement();
            //variable con la sentencia o script sql
             String Consulta = " select *  " +
                               " From Vuelo ";
                               
         //Ejecutar la consulta t llenar una estructura con el o los resultados obtenidos 
         ResultSet rs = sql.executeQuery(Consulta);
            return rs;
                
        }catch(SQLServerException e){
                 JOptionPane.showMessageDialog(null, e.toString());
                         return null;
     }
     }
            
public static int insertReserva(reservas miReserva) throws SQLException {
    int filasAfectadas = 0;
    Statement sql = (Statement) Conexion.getConexion().createStatement();
    
    // INSERT completo con TODOS los campos de la tabla Reserva
    String insertar = " INSERT INTO Reserva (ID_Reserva, ID_Vuelo, ID_Pasajero, Fecha_Reserva, Estado, Precio) " +
                      " VALUES(" + miReserva.getID_Reserva() + ", " +
                      miReserva.getID_Vuelo() + ", " +
                      miReserva.getID_Pasajero() + ", " +
                      " '" + miReserva.getFecha_Reserva() + "', " +
                      " '" + miReserva.getEstado() + "', " +
                      miReserva.getPrecio() + ")";
    
    filasAfectadas = sql.executeUpdate(insertar);
    sql.close(); // Cerrar statement
    
    return filasAfectadas;
   
}
   
         public static reservas obtenerReserva(String Id)throws SQLException{
                 try {
            //declarar la conexion a sql server
            Statement sql = (Statement) Conexion.getConexion().createStatement();
            //variable con la sentencia o script sql
             String Consulta = " select *  " +
                               " From Reserva " +
                               " Where ID_Reserva = " + Id;
         //Ejecutar la consulta t llenar una estructura con el o los resultados obtenidos 
         ResultSet rs = sql.executeQuery(Consulta);
         
         reservas Encontrado = new reservas();
         while (rs.next()){
             //resultado = Integer.valueOf(rs.getString(1));//es mejor este 
             //resultado= (rs.getInt(1)) + 1;//este es bueno pero
             Encontrado.setID_Reserva(rs.getInt(1));
             Encontrado.setID_Vuelo(rs.getInt(2));
             Encontrado.setID_Pasajero(rs.getInt(3));
             Encontrado.setEstado(rs.getInt(4));
             Encontrado.setPrecio(rs.getInt(5));
             Encontrado.setFecha_Reserva(rs.getDate(6));
             
             
         }
            return Encontrado;
                
        }catch(SQLServerException e){
                 JOptionPane.showMessageDialog(null, e.toString());
                         return null;
                        
                        }
    
         
     
     }
         
 
    public static int updateReserva(reservas mireserva) throws SQLException{
    int filasAfectadas = 0;
    Statement sql = (Statement) Conexion.getConexion().createStatement();
    String update = " Update Reserva   " +
                    " set ID_Vuelo = " + mireserva.getID_Vuelo() + ", " +
                    " ID_Pasajero = " + mireserva.getID_Pasajero() + ", " +
                    " Fecha_Reserva = '" + mireserva.getFecha_Reserva() + "', " +
                    " Estado = " + mireserva.getEstado() + ", " +
                    " Precio = " + mireserva.getPrecio() + 
                    " where ID_Reserva = " + mireserva.getID_Reserva(); 
                     
                   
        
    filasAfectadas = sql.executeUpdate(update);
                      
   // insert into Especie values
    
    
    
    return filasAfectadas;
}

        public static ResultSet listarReservas() throws SQLException{
                       try {
            //declarar la conexion a sql server
            Statement sql = (Statement) Conexion.getConexion().createStatement();
            //variable con la sentencia o script sql
             String Consulta = " select *  " +
                               " From Reserva ";
                               
         //Ejecutar la consulta t llenar una estructura con el o los resultados obtenidos 
         ResultSet rs = sql.executeQuery(Consulta);
            return rs;
                
        }catch(SQLServerException e){
                 JOptionPane.showMessageDialog(null, e.toString());
                         return null;
     }
     }
}
