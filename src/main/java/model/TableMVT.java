package model;

public class TableMVT {
    private String proceso;
    private int tamanio;
    private int llegada;
    private int duracion;
    public TableMVT(String proceso, int tamanio, int llegada, int duracion) {
        this.proceso = proceso;
        this.tamanio = tamanio;
        this.llegada = llegada;
        this.duracion = duracion;
    }
    public String getProceso() {
        return proceso;
    }
    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public int getLlegada() {
        return llegada;
    }
    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
    
}
