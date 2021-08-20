package co.utp.misiontic2022.c2.model.vo;

public class Req2 {
    //Declaracion de variables de acuerdo a los datos de la consulta a realizar
    private int estrato;
    private int financiable;
    private double porcentaje;
    private String fechaInicio;

    //constructor
    public Req2(){

    }

    public Req2(String fechaInicio, int financiable, int estrato, double porcentaje){
        this.fechaInicio = fechaInicio;
        this.financiable = financiable;
        this.estrato = estrato;
        this.porcentaje = porcentaje;

    }
    //getters and Setters
    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getFinanciable() {
        return financiable;
    }

    public void setFinanciable(int financiable) {
        this.financiable = financiable;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
}
