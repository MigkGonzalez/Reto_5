package co.utp.misiontic2022.c2.view;

import java.util.ArrayList;

import co.utp.misiontic2022.c2.controller.ControllerQuery;
import co.utp.misiontic2022.c2.model.vo.Req1;
import co.utp.misiontic2022.c2.model.vo.Req2;
import co.utp.misiontic2022.c2.model.vo.Req3;

public class ViewReq {

    public static final ControllerQuery controller = new  ControllerQuery();

    public static void  req_1(){
        try{
            ArrayList<Req1> req1s = controller.queryReq1();

            for (Req1 req1 : req1s){
                System.out.printf("%d %d %s %s %n", 
                                 req1.getTotal(), 
                                 req1.getIdProyecto(), 
                                 req1.getPagado(), 
                                 req1.getProveedor());
            }
        } catch (Exception e){
            System.err.println(e);
        }  

    }

    public static void  req_2(){
        try{
            ArrayList<Req2> req2s = controller.queryReq2();

            for (Req2 req2 : req2s){
                System.out.printf("%s %d %d %f %n", 
                                 req2.getFechaInicio(), 
                                 req2.getFinanciable(), 
                                 req2.getEstrato(), 
                                 req2.getPorcentaje());
            }
        } catch (Exception e){
            System.err.println(e);
        }  

    }
    
    public static void  req_3(){
        try{
            ArrayList<Req3> req3s = controller.queryReq3();

            for (Req3 req3 : req3s){
                System.out.printf("%d %s %s %n" , 
                                 req3.getIdProyecto(), 
                                 req3.getPagado(), 
                                 req3.getClasificacion());
            }
        } catch (Exception e){
            System.err.println(e);
        }  

    }
}
