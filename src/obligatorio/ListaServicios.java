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
public class ListaServicios implements IListaServicios{
  NodoListaServicios inicio;
    NodoListaServicios fin;
    public ListaServicios() {
        this.inicio = null;
        this.fin = null;
    }

    public NodoListaServicios getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaServicios inicio) {
        this.inicio = inicio;
    }

    public NodoListaServicios getFin() {
        return fin;
    }

    public void setFin(NodoListaServicios fin) {
        this.fin = fin;
    }
    
    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarInicio(String aerolinea, int numeroVuelo, String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarFinal(String aerolinea, int numeroVuelo, String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarOrd(String aerolinea, int numeroVuelo, String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodoListaServicios obtenerServicioDelVuelo(String aerolinea, int numeroVuelo, String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
