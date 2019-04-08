package progra1final;
public class ganadoresBingo<T> {
//atributos
    private T element;
    private ganadoresBingo<T> next;

    //Constructores
    public ganadoresBingo(){
        this.element = null;
        this.next = null;
    }

    public ganadoresBingo(T element){
        this.element = element;
        this.next = null;
    }

    public ganadoresBingo(T element, ganadoresBingo<T> next){
        this.element = element;
        this.next = next;
    }

    //metodos
    public T getElement(){
        return this.element;
    }

    public void setElement(T element){
        this.element = element;
    }

    public ganadoresBingo<T> getNext(){
        return this.next;
    }

    public void setNext(ganadoresBingo<T> next){
        this.next = next;
    }
}