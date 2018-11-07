/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

/**
 *
 * @author Usuario
 */
public class NodoListaServicios {
     String aerolinea; int numeroVuelo; String servicio;
     NodoListaServicios siguiente;

    public NodoListaServicios(String aerolinea, int numeroVuelo, String servicio) {
        this.aerolinea = aerolinea;
        this.numeroVuelo = numeroVuelo;
        this.servicio = servicio;
        this.siguiente = null;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public NodoListaServicios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaServicios siguiente) {
        this.siguiente = siguiente;
    }
     
}
