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
public class C_NodoJPS {
    public E_Sorteos element;
    public C_NodoJPS next;
    
    public C_NodoJPS(){
        
    }
    public C_NodoJPS(E_Sorteos element){
        this.element = element;
        this.next = null;
        
    }
    public C_NodoJPS(E_Sorteos element,C_NodoJPS next){
        this.element= element;
        this.next=next;
    }

    public E_Sorteos getElement() {
        return element;
    }

    public void setElement(E_Sorteos element) {
        this.element = element;
    }

    public C_NodoJPS getNext() {
        return next;
    }

    public void setNext(C_NodoJPS next) {
        this.next = next;
    }
    
}
