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
public class B_ListaJPS {
    
    //Declaracion de variables
    C_NodoJPS head;
    C_NodoJPS current,tail;
    int position,size;
    
    //Constructores
    public B_ListaJPS(){
        this.head = new C_NodoJPS();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    //metodos de la clase
    //Agregar elemento en cualquier parte de la lista
    public void insert(E_Sorteos element) {
        C_NodoJPS newNode = new C_NodoJPS(element, this.current.getNext());
        this.current.setNext(newNode);
        
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;
    }
    //Agregar elemento al final de la lista
    public void append(E_Sorteos element) {
        C_NodoJPS newNode = new C_NodoJPS(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }
    //Eliminar elemento de
    public void remove() {
        if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        } 
        C_NodoJPS temp = head;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
        }
        temp.setNext(this.current.getNext());
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
        }
        else
            this.current = this.current.getNext();
        this.size--;
    }
    
    //Eliminar todos los elmentos de la lista
    public void clear() {
        this.head = this.tail = this.current = new C_NodoJPS();
        this.position = -1;
        this.size = 0;
    }
    //otros Metodos de la clase
    public Object getElement(){
        return this.current.getElement();
    }

    public int getSize() {
        return this.size;
    }

    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Actualmente en último nodo, no se puede avanzar");
            return false;
        }
        this.current = this.current.getNext();
        this.position++;
        return true;
    }   

    public void goToStart(){
        this.current = this.head;
        this.position = -1;
    }


}
