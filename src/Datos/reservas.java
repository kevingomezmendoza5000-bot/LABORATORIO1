/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class reservas {
    int ID_Reserva; 
    int ID_Vuelo ;
    int ID_Pasajero;
    Date Fecha_Reserva; 
    int Estado;
    int Precio;

    public reservas() {
    }

    public reservas(int ID_Reserva, int ID_Vuelo, int ID_Pasajero, Date Fecha_Reserva, int Estado, int Precio) {
        this.ID_Reserva = ID_Reserva;
        this.ID_Vuelo = ID_Vuelo;
        this.ID_Pasajero = ID_Pasajero;
        this.Fecha_Reserva = Fecha_Reserva;
        this.Estado = Estado;
        this.Precio = Precio;
    }

    public int getID_Reserva() {
        return ID_Reserva;
    }

    public void setID_Reserva(int ID_Reserva) {
        this.ID_Reserva = ID_Reserva;
    }

    public int getID_Vuelo() {
        return ID_Vuelo;
    }

    public void setID_Vuelo(int ID_Vuelo) {
        this.ID_Vuelo = ID_Vuelo;
    }

    public int getID_Pasajero() {
        return ID_Pasajero;
    }

    public void setID_Pasajero(int ID_Pasajero) {
        this.ID_Pasajero = ID_Pasajero;
    }

    public Date getFecha_Reserva() {
        return Fecha_Reserva;
    }

    public void setFecha_Reserva(Date Fecha_Reserva) {
        this.Fecha_Reserva = Fecha_Reserva;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    
    
}
