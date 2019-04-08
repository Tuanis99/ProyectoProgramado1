package progra1final;
public class listaGanadoresBingo {
    public ganadoresBingo ganadoresBingo;
    //Declaracion de variables
    ganadoresBingo head;
    ganadoresBingo current;
    ganadoresBingo tail;
    int position;
    
        //Constructores
    public listaGanadoresBingo(){
        this.head = new ganadoresBingo();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;            
}
       //Agregar elemento al final de la lista
    public void append(sorteoBingo element){
        ganadoresBingo ganadorBingo = new ganadoresBingo(element);
        this.tail.setNext(ganadorBingo);
        this.tail = ganadorBingo;     
    }
}