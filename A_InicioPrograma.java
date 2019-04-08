/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;

public class A_InicioPrograma {
    //Inician lsitas que se utilizaran dentro del programa
    public static B_ListaJPS JPSDATA = new B_ListaJPS();
    public static G_ListaTiquetes TiquetesGenerados = new G_ListaTiquetes();
    public static K_ListaHistorial historial = new K_ListaHistorial();
    public static cola pedidos = new cola();
    public static cola pedidospreferencial = new cola();
    public static cola informacionpreferencial = new cola();
    public static cola informacionpedido = new cola();
    public static listaGanadoresBingo ganadoresBingo = new listaGanadoresBingo();
    public static listaGanadoresLoteria ganadoresLote = new listaGanadoresLoteria();
    public static listaGanadoresTiempos ganadoresTiempos = new listaGanadoresTiempos();
    public static listaGanadoresLotto ganadoresLotto = new listaGanadoresLotto();
    
    public static void main(String[] args) {
        D_pantallaInicio main_interfaz = new D_pantallaInicio();
        main_interfaz.setVisible(true);
        main_interfaz.setLocationRelativeTo(null);
    }  
}