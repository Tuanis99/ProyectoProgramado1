package progra1final;
public class ganadoresLoteria<T>{
    //atributos
    private T element;
    private ganadoresLoteria<T> next;

    //Constructores
    public ganadoresLoteria(){
        this.element = null;
        this.next = null;
    }

    public ganadoresLoteria(T element){
        this.element = element;
        this.next = null;
    }

    public ganadoresLoteria(T element, ganadoresLoteria<T> next){
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

    public ganadoresLoteria<T> getNext(){
        return this.next;
    }

    public void setNext(ganadoresLoteria<T> next){
        this.next = next;
    }
}