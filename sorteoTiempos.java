package progra1final;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.*;
public class sorteoTiempos{
    public int principal, jugada;
    public String fechaTiempos;
    
    public String fechaTiempos(){
        Date date = new Date(); // this object contains the current date value  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");   
        String fechaSorteoTiempos = (formatter.format(date));
        return fechaSorteoTiempos;
    }
    
    public int getPrincipal(){
        return principal;
    }

    public int getJugada(){
        return jugada;
    }

    public void setJugada(int jugada){
        this.jugada = jugada;
    }

    public void setPrincipal(int principal){
        this.principal = principal;
    }

    public String getFechaTiempos(){
        return fechaTiempos;
    }

    public void setFechaTiempos(String fechaSorteoTiempos){
        this.fechaTiempos = fechaSorteoTiempos;
    }
    
    public int sacarPrincipal(){
        Random rand = new Random();
        principal = rand.nextInt(100 + 1);
        return principal;
    }
    
    public int sacarJugada(){
        Random rand = new Random();
        jugada = rand.nextInt(100 + 1);
        return jugada;
    }
    
    public sorteoTiempos(int principal, String fechaTiempos, int jugada){
        this.principal = principal;
        this.fechaTiempos = fechaTiempos;
        this.jugada = jugada;
    }

    public sorteoTiempos() {
    }
}
