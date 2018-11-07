/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.util.Calendar;
import obligatorio.Retorno.Resultado;

/**
 *
 * @author Usuario
 */
public class Sistema implements ISistema {

    @Override
    public Retorno crearSistemaReservas() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno destruirSistemaReservas() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno registrarVuelo(int numero, String aerolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, Calendar fechaHoraSalida, int duracion) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno ingresarServicio(String aerolinea, int numero, String servicio) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno borrarServicio(String aerolinea, int numero, String servicio) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno ingresarComentario(String aerolinea, int numero, String comentario, int ranking) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno realizarReserva(int cliente, int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno cancelarReserva(int cliente, int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarServicios(String numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarVuelosAerolinea(String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarAerolineasRanking() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarComentarios(int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarEspera(int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno mostarDistancias() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno Caminomascorto(int ciudadOrigen, int ciudadDestino, int[][] mapa) {
        int columnas = mapa[0].length;
        int distancia = Integer.MAX_VALUE;
        int escala = ciudadOrigen;
        int filas  =mapa.length;
        
        for (int i =0 ; i<columnas ; i++){
            if(mapa[ciudadOrigen][i] != -1 && mapa[ciudadDestino][i] !=-1 &&
               mapa[ciudadOrigen][i] >0 && mapa[ciudadDestino][i] >0  &&
                    mapa[ciudadOrigen][i] + mapa[ciudadDestino][i]< distancia){
            
                distancia =mapa[ciudadOrigen][i]+mapa[ciudadDestino][i];
                escala = i;
            
            }
                        
        }
        
        String R = "El camino mas corto es : "+Integer.toString(ciudadOrigen) + "- "+ Integer.toString(escala) +"- " + Integer.toString(ciudadDestino);
        Retorno ret=new Retorno(Resultado.NO_IMPLEMENTADA);
        ret.valorString=R;
        
        return  ret;
    }
    
}
