package progra1final;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.*;
public class sorteoBingo{
    public int numbUno, numbDos, numbTres, numbCuatro, numbCinco, numbSeis, numbSiete, numbOcho, numbNueve;
    public String fechaBingo;
    
    public String fechaBingo(){
        Date date = new Date(); // this object contains the current date value  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");   
        String fechaSorteoBingo = (formatter.format(date));
        return fechaSorteoBingo;
    }
    
    public String getFechaBingo(){
        return fechaBingo;
    }

    public void setFechaBingo(String fechaSorteoBingo){
        this.fechaBingo = fechaSorteoBingo;
    }

    public sorteoBingo(int numbUno, int numbDos, int numbTres, int numbCuatro, int numbCinco, int numbSeis, int numbSiete, int numbOcho, int numbNueve, String fechaBingo) {
        this.numbUno = numbUno;
        this.numbDos = numbDos;
        this.numbTres = numbTres;
        this.numbCuatro = numbCuatro;
        this.numbCinco = numbCinco;
        this.numbSeis = numbSeis;
        this.numbSiete = numbSiete;
        this.numbOcho = numbOcho;
        this.numbNueve = numbNueve;
        this.fechaBingo = fechaBingo;
    }

    public sorteoBingo() {
    }
    
    public int getNumbUno() {
        return numbUno;
    }

    public void setNumbUno(int numbUno) {
        this.numbUno = numbUno;
    }

    public int getNumbDos() {
        return numbDos;
    }

    public void setNumbDos(int numbDos) {
        this.numbDos = numbDos;
    }

    public int getNumbTres() {
        return numbTres;
    }

    public void setNumbTres(int numbTres) {
        this.numbTres = numbTres;
    }

    public int getNumbCuatro() {
        return numbCuatro;
    }

    public void setNumbCuatro(int numbCuatro) {
        this.numbCuatro = numbCuatro;
    }

    public int getNumbCinco() {
        return numbCinco;
    }

    public void setNumbCinco(int numbCinco) {
        this.numbCinco = numbCinco;
    }

    public int getNumbSeis() {
        return numbSeis;
    }

    public void setNumbSeis(int numbSeis) {
        this.numbSeis = numbSeis;
    }

    public int getNumbSiete() {
        return numbSiete;
    }

    public void setNumbSiete(int numbSiete) {
        this.numbSiete = numbSiete;
    }

    public int getNumbOcho() {
        return numbOcho;
    }

    public void setNumbOcho(int numbOcho) {
        this.numbOcho = numbOcho;
    }

    public int getNumbNueve() {
        return numbNueve;
    }

    public void setNumbNueve(int numbNueve) {
        this.numbNueve = numbNueve;
    }
    
    public int sacarNumbUno(){
        Random rand = new Random();
        numbUno = rand.nextInt(100 + 1);
        return numbUno;
    }
    
    public int sacarNumbDos(){
        Random rand = new Random();
        numbDos = rand.nextInt(100 + 1);
        return numbDos;
    }
    
    public int sacarNumbTres(){
        Random rand = new Random();
        numbTres = rand.nextInt(100 + 1);
        return numbTres;
    }
    
    public int sacarNumbCuatro(){
        Random rand = new Random();
        numbCuatro = rand.nextInt(100 + 1);
        return numbCuatro;
    }
    
    public int sacarNumbCinco(){
        Random rand = new Random();
        numbCinco = rand.nextInt(100 + 1);
        return numbCinco;
    }
    
    public int sacarNumbSeis(){
        Random rand = new Random();
        numbSeis = rand.nextInt(100 + 1);
        return numbSeis;
    }
    
    public int sacarNumbSiete(){
        Random rand = new Random();
        numbSiete = rand.nextInt(100 + 1);
        return numbSiete;
    }
    
    public int sacarNumbOcho(){
        Random rand = new Random();
        numbOcho = rand.nextInt(100 + 1);
        return numbOcho;
    }
    
    public int sacarNumbNueve(){
        Random rand = new Random();
        numbNueve = rand.nextInt(100 + 1);
        return numbNueve;
    }    
}
