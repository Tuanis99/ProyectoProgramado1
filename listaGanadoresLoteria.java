package progra1final;
public class listaGanadoresLoteria{
    public ganadoresLoteria ganadoresLoteria;
    //Declaracion de variables
    ganadoresLoteria head;
    ganadoresLoteria current;
    ganadoresLoteria tail;
    int position;
    
        //Constructores
    public listaGanadoresLoteria(){
        this.head = new ganadoresLoteria();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;            
}
       //Agregar elemento al final de la lista
    public void append(sorteoLoteria element){
        ganadoresLoteria ganadorLoteria = new ganadoresLoteria(element);
        this.tail.setNext(ganadorLoteria);
        this.tail = ganadorLoteria;     
    }
}