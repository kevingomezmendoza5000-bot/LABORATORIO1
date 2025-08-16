/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author kevin
 */
public class Vuelos {
    private int idVuelo;
    private int idAvion;
    private String codigoVuelo;
    private String origen;
    private String destino;
    private Date fecha;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private String estado;

    public Vuelos() {
    }

    public Vuelos(int idVuelo, int idAvion, String codigoVuelo, String origen, String destino, Date fecha, LocalTime horaSalida, LocalTime horaLlegada, String estado) {
        this.idVuelo = idVuelo;
        this.idAvion = idAvion;
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.estado = estado;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
