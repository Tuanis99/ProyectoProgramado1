/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author luisg
 */
public class Ee_Loteria extends E_Sorteos {
    public int numero;
    public Date fecha;
    public Ee_Loteria(String nombreSorteo, int codigo, String tipoSorteo, int emisiones, Date fechaSorteo, int numeroGanador) {
        super(nombreSorteo, codigo, tipoSorteo, emisiones, fechaSorteo, numeroGanador);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void generarDigitos(){
        // Metemos en una lista los números del 1 al 100.
        ArrayList<Integer> numbers = new ArrayList<>(100);
        for (int i=1;i<101;i++){
            numbers.add(i);
        }

        // Instanciamos la clase Random
        Random random = new Random();

        // Mientras queden cartas en el mazo (en la lista de numbers)
        while (numbers.size()>1){
            // Elegimos un índice al azar, entre 0 y el número de cartas que quedan por sacar
            int randomIndex = random.nextInt(numbers.size());

            // Damos la carta al jugador (sacamos el número por pantalla)
            System.out.println("Not Repeated Random Number "+numbers.get(randomIndex));

            // Y eliminamos la carta del mazo (la borramos de la lista)
            numbers.remove(randomIndex);
        }
    }
}
