package progra1final;
public class ganadoresLotto<T>{
    //atributos
    private T element;
    private ganadoresLotto<T> next;

    //Constructores
    public ganadoresLotto(){
        this.element = null;
        this.next = null;
    }

    public ganadoresLotto(T element){
        this.element = element;
        this.next = null;
    }

    public ganadoresLotto(T element, ganadoresLotto<T> next){
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

    public ganadoresLotto<T> getNext(){
        return this.next;
    }

    public void setNext(ganadoresLotto<T> next){
        this.next = next;
    }
}