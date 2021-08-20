package co.utp.misiontic2022.c2.model.vo.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import co.utp.misiontic2022.c2.model.vo.Req2;
import co.utp.misiontic2022.c2.conector.Conector;

public class Req2_Dao {
    public ArrayList<Req2> req2s() throws SQLException {
        
        var result = new ArrayList<Req2>();

        String query = ("SELECT Proyecto.Fecha_Inicio AS inicio, Tipo.Financiable, Tipo.Estrato, Proyecto.Porcentaje_Cuota_Inicial * 100"
                     + " FROM Tipo, Proyecto"
                     + " WHERE Proyecto.ID_Tipo = Tipo.ID_Tipo" 
                     + " AND Proyecto.Porcentaje_Cuota_Inicial > 0.2 AND Tipo.Estrato >= 5"
                     + " AND Tipo.Financiable = 0 AND DATE(proyecto.Fecha_Inicio) < '2021-1-1'"
                     + " ORDER BY Fecha_Inicio;");
                        
            try(var connection = Conector.getConnection();
                var statement = connection.prepareStatement(query);
                var rset = statement.executeQuery();){

                    while (rset.next()) {
                        var req_2VO = new Req2();
                        req_2VO.setFechaInicio(rset.getString("inicio"));
                        req_2VO.setFinanciable(rset.getInt("Financiable"));
                        req_2VO.setEstrato(rset.getInt("Estrato"));
                        req_2VO.setPorcentaje(rset.getInt("Proyecto.Porcentaje_Cuota_Inicial * 100"));

                        result.add(req_2VO);                    
                    
                    }                
              
            }
            return result;
                    
    }
    
}
