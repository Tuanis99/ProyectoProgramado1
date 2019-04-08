package progra1final;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.*;
public class sorteoLotto{
    public int numUno, numDos, numTres, numCuatro, numCinco, numSeis, numSiete;
    public String fechaLotto;
    
    public String fechaLotto(){
        Date date = new Date(); // this object contains the current date value  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");   
        String fechaSorteoLotto = (formatter.format(date));
        return fechaSorteoLotto;
    }
    
    public String getFechaLotto(){
        return fechaLotto;
    }

    public sorteoLotto() {
    }
    
    public void setFechaLotto(String fechaSorteoLotto){
        this.fechaLotto = fechaSorteoLotto;
    }

    public sorteoLotto(int numUno, int numDos, int numTres, int numCuatro, int numCinco, int numSeis, int numSiete, String fechaLotto) {
        this.numUno = numUno;
        this.numDos = numDos;
        this.numTres = numTres;
        this.numCuatro = numCuatro;
        this.numCinco = numCinco;
        this.numSeis = numSeis;
        this.numSiete = numSiete;
        this.fechaLotto = fechaLotto;
    }

    public int getNumUno() {
        return numUno;
    }

    public void setNumUno(int numUno) {
        this.numUno = numUno;
    }

    public int getNumDos() {
        return numDos;
    }

    public void setNumDos(int numDos) {
        this.numDos = numDos;
    }

    public int getNumTres() {
        return numTres;
    }

    public void setNumTres(int numTres) {
        this.numTres = numTres;
    }

    public int getNumCuatro() {
        return numCuatro;
    }

    public void setNumCuatro(int numCuatro) {
        this.numCuatro = numCuatro;
    }

    public int getNumCinco() {
        return numCinco;
    }

    public void setNumCinco(int numCinco) {
        this.numCinco = numCinco;
    }

    public int getNumSeis() {
        return numSeis;
    }

    public void setNumSeis(int numSeis) {
        this.numSeis = numSeis;
    }

    public int getNumSiete() {
        return numSiete;
    }

    public void setNumSiete(int numSiete) {
        this.numSiete = numSiete;
    }
    
    public int sacarNumUno(){
        Random rand = new Random();
        numUno = rand.nextInt(100 + 1);
        return numUno;
    }
    
    public int sacarNumDos(){
        Random rand = new Random();
        numDos = rand.nextInt(100 + 1);
        return numDos;
    }
    
    public int sacarNumTres(){
        Random rand = new Random();
        numTres = rand.nextInt(100 + 1);
        return numTres;
    }
    
    public int sacarNumCuatro(){
        Random rand = new Random();
        numCuatro = rand.nextInt(100 + 1);
        return numCuatro;
    }
    
    public int sacarNumCinco(){
        Random rand = new Random();
        numCinco = rand.nextInt(100 + 1);
        return numCinco;
    }
    
    public int sacarNumSeis(){
        Random rand = new Random();
        numSeis = rand.nextInt(100 + 1);
        return numSeis;
    }
    
    public int sacarNumSiete(){
        Random rand = new Random();
        numSiete = rand.nextInt(100 + 1);
        return numSiete;
    }
    
    
}
