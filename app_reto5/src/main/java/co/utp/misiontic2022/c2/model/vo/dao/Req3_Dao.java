package co.utp.misiontic2022.c2.model.vo.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import co.utp.misiontic2022.c2.model.vo.Req3;
import co.utp.misiontic2022.c2.conector.Conector;

public class Req3_Dao {
    public ArrayList<Req3> req3s() throws SQLException {
        
        var result = new ArrayList<Req3>();
        
        String query = ("SELECT proyecto.ID_Proyecto, compra.pagado, proyecto.Clasificacion"
                     + " FROM materialconstruccion, compra, proyecto"
                     + " WHERE materialconstruccion.Importado = 'Si'"
                     + " AND compra.ID_MaterialConstruccion = materialconstruccion.ID_MaterialConstruccion"
                     + " AND proyecto.ID_Proyecto = compra.ID_Proyecto"
                     + " AND compra.Pagado IN ('No', 'Parcialmente') AND proyecto.Clasificacion"
                     + " IN ('Apartamento', 'Apartaestudio') AND proyecto.Acabados = 'No'"
                     + " GROUP BY proyecto.ID_Proyecto ORDER BY 'pagado';");
                    
            try(var connection = Conector.getConnection();
                var statement = connection.prepareStatement(query);
                var rset = statement.executeQuery();){

                    while (rset.next()) {
                        var req_3VO = new Req3();
                        req_3VO.setIdProyecto(rset.getInt("ID_proyecto"));
                        req_3VO.setPagado(rset.getString("pagado"));
                        req_3VO.setClasificacion(rset.getString("Clasificacion"));

                        result.add(req_3VO);                        
                    }                
              
            }
            return result;
                    
    }
}
