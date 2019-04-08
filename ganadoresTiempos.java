package progra1final;
public class ganadoresTiempos<T>{
    //atributos
    private T element;
    private ganadoresTiempos<T> next;

    //Constructores
    public ganadoresTiempos(){
        this.element = null;
        this.next = null;
    }

    public ganadoresTiempos(T element){
        this.element = element;
        this.next = null;
    }

    public ganadoresTiempos(T element, ganadoresTiempos<T> next){
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

    public ganadoresTiempos<T> getNext(){
        return this.next;
    }

    public void setNext(ganadoresTiempos<T> next){
        this.next = next;
    }
}