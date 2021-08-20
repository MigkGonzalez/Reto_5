package co.utp.misiontic2022.c2.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import co.utp.misiontic2022.c2.model.vo.Req1;
import co.utp.misiontic2022.c2.model.vo.Req2;
import co.utp.misiontic2022.c2.model.vo.Req3;

import co.utp.misiontic2022.c2.model.vo.dao.Req1_Dao;
import co.utp.misiontic2022.c2.model.vo.dao.Req2_Dao;
import co.utp.misiontic2022.c2.model.vo.dao.Req3_Dao;

public class ControllerQuery {
    private Req1_Dao req1_Dao;
    private Req2_Dao req2_Dao;
    private Req3_Dao req3_Dao;

    public ControllerQuery(){
        this.req1_Dao = new Req1_Dao();
        this.req2_Dao = new Req2_Dao();
        this.req3_Dao = new Req3_Dao();
    }

    public ArrayList<Req1> queryReq1() throws SQLException {
        return req1_Dao.req1s();
    }

    public ArrayList<Req2> queryReq2() throws SQLException {
        return req2_Dao.req2s();
    }

    public ArrayList<Req3> queryReq3() throws SQLException {
        return req3_Dao.req3s();
    }
}
