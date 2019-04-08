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
public class H_NodoTiquetes <T>{
       //atributos

    public Hh_Tiquetes element;
    public H_NodoTiquetes<T> next;

    //Constructores
    public H_NodoTiquetes() {
        this.element = null;
        this.next = null;
    }

    public H_NodoTiquetes(Hh_Tiquetes element) {
        this.element = element;
        this.next = null;
    }

    public H_NodoTiquetes(Hh_Tiquetes element, H_NodoTiquetes<T> next) {
        this.element = element;
        this.next = next;
    }

    //metodos

    public Hh_Tiquetes getElement() {
        return this.element;
    }

    public void setElement (Hh_Tiquetes element) {
        this.element = element;
    }

    public H_NodoTiquetes<T> getNext() {
        return this.next;
    }

    public void setNext(H_NodoTiquetes<T> next) {
        this.next = next;
    }
}
