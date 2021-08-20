package co.utp.misiontic2022.c2.model.vo.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import co.utp.misiontic2022.c2.model.vo.Req1;
import co.utp.misiontic2022.c2.conector.Conector;

public class Req1_Dao {
    public ArrayList<Req1> req1s() throws SQLException {
        
        var result = new ArrayList<Req1>();
        String query = ("SELECT SUM(Cantidad) AS total, Id_proyecto, pagado, proveedor" 
                     + " FROM Compra WHERE Pagado = 'No'"
                     + " GROUP BY ID_Proyecto HAVING (total) > 50"
                     + " ORDER BY id_proyecto;");
            
            

            try(var connection = Conector.getConnection();
                var statement = connection.prepareStatement(query);
                var rset = statement.executeQuery();){

                    while (rset.next()) {
                        var req_1VO = new Req1();
                        req_1VO.setTotal(rset.getInt("total"));
                        req_1VO.setIdProyecto(rset.getInt("Id_proyecto"));
                        req_1VO.setPagado(rset.getString("pagado"));
                        req_1VO.setProveedor(rset.getString("proveedor"));

                        result.add(req_1VO);
                    }                
              
            }
            return result;
            
        
    }
    
}
