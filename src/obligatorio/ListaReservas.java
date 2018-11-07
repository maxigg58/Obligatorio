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
public class ListaReservas implements IListaReservas{
    private NodoListaReservas inicio;
     private NodoListaReservas fin;
     
         public void ListaReservas(){
        this.inicio=null;
        this.fin=null;
        
    }

    public NodoListaReservas getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaReservas inicio) {
        this.inicio = inicio;
    }

    public NodoListaReservas getFin() {
        return fin;
    }

    public void setFin(NodoListaReservas fin) {
        this.fin = fin;
    }

    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsertarInicio(int cliente, int nVuelo, String aereolinea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarFinal(int cliente, int nVuelo, String aereolinea) {
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
    public void agregarOrd(int cliente, int nVuelo, String aereolinea) {
            NodoListaReservas  nuevo = new NodoListaReservas( cliente,nVuelo,aereolinea);
             NodoListaReservas aux = this.getInicio(); 
                
        if(this.esVacia()|| nVuelo< this.getInicio().getnVuelo() ){
            
           this.InsertarInicio( cliente,nVuelo,aereolinea);
            
        }
        
        else  {
                 while (aux.getSiguiente()!= null && aux.getSiguiente().getnVuelo() < nVuelo )
                         aux=aux.getSiguiente();
                         nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                 
            } 
                  }

    @Override
    public NodoListaVuelos obtenerReserva(int numeroVuelo, int cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
         
         
}
