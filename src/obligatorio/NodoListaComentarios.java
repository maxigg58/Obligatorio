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
public class NodoListaComentarios {
    String aerolinea; int numero; String comentario; int ranking;
    NodoListaComentarios siguiente;

    public NodoListaComentarios(String aerolinea, int numero, String comentario, int ranking) {
        this.aerolinea = aerolinea;
        this.numero = numero;
        this.comentario = comentario;
        this.ranking = ranking;
        this.siguiente = null;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public NodoListaComentarios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaComentarios siguiente) {
        this.siguiente = siguiente;
    }
    
}
