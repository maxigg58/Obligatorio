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
public class NodoColaEspera {
      int  cliente;
      int nVuelo;
      String aereolinea;
    NodoColaEspera siguiente;

    public NodoColaEspera(int cliente, int nVuelo, String aereolinea) {
        this.cliente = cliente;
        this.nVuelo = nVuelo;
        this.aereolinea = aereolinea;
        this.siguiente = null;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    public String getAereolinea() {
        return aereolinea;
    }

    public void setAereolinea(String aereolinea) {
        this.aereolinea = aereolinea;
    }

    public NodoColaEspera getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColaEspera siguiente) {
        this.siguiente = siguiente;
    }

}
