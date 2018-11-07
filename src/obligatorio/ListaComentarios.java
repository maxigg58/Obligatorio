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
public class ListaComentarios implements IListaComentarios{
  private NodoListaComentarios inicio;
     private NodoListaComentarios fin;
    
    
        public void ListaComentarios(){
        this.inicio=null;
        this.fin=null;
        
    }    

    public NodoListaComentarios getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaComentarios inicio) {
        this.inicio = inicio;
    }

    public NodoListaComentarios getFin() {
        return fin;
    }

    public void setFin(NodoListaComentarios fin) {
        this.fin = fin;
    }

    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarInicio(String aerolinea, int numero, String comentario, int ranking) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarFinal(String aerolinea, int numero, String comentario, int ranking) {
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
    public void agregarOrd(String aerolinea, int numero, String comentario, int ranking) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodoListaVuelos obtenerComentario(int numeroVuelo, int cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
    
}
