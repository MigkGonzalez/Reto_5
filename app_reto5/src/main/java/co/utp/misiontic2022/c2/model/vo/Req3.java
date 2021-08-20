package co.utp.misiontic2022.c2.model.vo;

public class Req3 {
    //Declaracion de variables de acuerdo a los datos de la consulta a realizar
    private int idProyecto;
    private String pagado;
    private String clasificacion;

    //constructor
    public Req3(){

    }

    public Req3(int idProyecto, String pagado, String clasificacion) {
        this.idProyecto = idProyecto;
        this.pagado = pagado;
        this.clasificacion = clasificacion;
    }
    //getters and Setters   
    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
}
