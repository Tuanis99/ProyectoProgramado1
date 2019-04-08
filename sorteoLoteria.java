package progra1final;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.*;
public class sorteoLoteria{
    public int ganadorLoteria;
    public String fechaLoteria;
    
    public String fechaLoteria(){
        Date date = new Date(); // this object contains the current date value  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");   
        String fechaSorteoLot = (formatter.format(date));
        return fechaSorteoLot;
    }
   
    public int getGanadorLoteria(){
        return ganadorLoteria;
    }

    public void setGanadorLoteria(int ganadorLoteria){
        this.ganadorLoteria = ganadorLoteria;
    }

    public String getFechaLoteria(){
        return fechaLoteria;
    }

    public void setFechaLoteria(String fechaSorteoLot){
        this.fechaLoteria = fechaSorteoLot;
    }

    public sorteoLoteria(int ganadorLoteria, String fechaLoteria){
        this.ganadorLoteria = ganadorLoteria;
        this.fechaLoteria = fechaLoteria;
    }
    
    public int sacarGanadorLoteria(){
        Random rand = new Random();
        ganadorLoteria = rand.nextInt(100 + 1);
        return ganadorLoteria;
    }

    public sorteoLoteria() {
    }
}