package co.utp.misiontic2022.c2.model.vo;

public class Req1 {
    //Declaracion de variables de acuerdo a los datos de la consulta a realizar
    private int total;
    private int idProyecto;
    private String pagado;
    private String proveedor;

    //constructor
    public Req1(){

    }

    public Req1(int total, int idProyecto, String pagado, String proveedor){
        this.total = total;
        this.idProyecto = idProyecto;
        this.pagado = pagado;
        this.proveedor = proveedor;
    }
    //getters and Setters
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    


}
    