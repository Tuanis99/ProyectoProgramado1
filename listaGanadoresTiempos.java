package progra1final;
public class listaGanadoresTiempos {
    public ganadoresTiempos ganadoresTiempos;
    //Declaracion de variables
    ganadoresTiempos head;
    ganadoresTiempos current;
    ganadoresTiempos tail;
    int position;
    
        //Constructores
    public listaGanadoresTiempos(){
        this.head = new ganadoresTiempos();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;            
}
       //Agregar elemento al final de la lista
    public void append(sorteoTiempos element){
        ganadoresTiempos ganadorTiempos = new ganadoresTiempos(element);
        this.tail.setNext(ganadorTiempos);
        this.tail = ganadorTiempos;     
    }    
}