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
public interface IColaEspera {
    public void encolar(int cliente, int nVuelo, String aereolinea);
    public void desencolar();
    public boolean esVacia();
    public boolean esllena();
    public Object frente();
    public int elementos();
}
