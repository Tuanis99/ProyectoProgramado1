/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;

/**
 *
 * @author luisg
 */
public class N_NodoCola {
    public Object elemento; //informacion del nodo
    public N_NodoCola ant, sgte; //apuntador

    //Constructor No. 1
    public N_NodoCola(Object elemento) {
        this.elemento = elemento;
        this.ant = this.sgte = null;
    }//Constructor

    // para la cola enlazada header
    public N_NodoCola() {
        this.sgte = null;
    }   
}
