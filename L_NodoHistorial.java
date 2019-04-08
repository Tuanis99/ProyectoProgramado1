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
public class L_NodoHistorial {
    //Declaracion de variables
    public Object element;
    public L_NodoHistorial next;
    public L_NodoHistorial previous;

    //Constructores
    public L_NodoHistorial() {
    }

    public L_NodoHistorial(Object element) {
        this.element = element;
        this.next = null;
        this.previous = null;
        }

    //métodos
    public Object getElement() {
        return this.element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public L_NodoHistorial getNext() {
        return this.next;
    }

    public void setNext(L_NodoHistorial next) {
        this.next = next;
    }

    public L_NodoHistorial getPrevious() {
        return this.previous;
    }

    public void setPrevious(L_NodoHistorial previous) {
        this.previous = previous;
    }
  
}
