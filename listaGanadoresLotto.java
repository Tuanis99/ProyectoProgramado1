package progra1final;
public class listaGanadoresLotto{
    public ganadoresLotto ganadoresLotto;
    //Declaracion de variables
    ganadoresLotto head;
    ganadoresLotto current;
    ganadoresLotto tail;
    int position;
    
        //Constructores
    public listaGanadoresLotto(){
        this.head = new ganadoresLotto();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;            
}
       //Agregar elemento al final de la lista
    public void append(sorteoLotto element){
        ganadoresLotto ganadorLotto = new ganadoresLotto(element);
        this.tail.setNext(ganadorLotto);
        this.tail = ganadorLotto;     
    }
}