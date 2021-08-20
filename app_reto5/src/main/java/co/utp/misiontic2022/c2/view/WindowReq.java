package co.utp.misiontic2022.c2.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import co.utp.misiontic2022.c2.controller.ControllerQuery;
import co.utp.misiontic2022.c2.model.vo.Req1;
import co.utp.misiontic2022.c2.model.vo.Req2;
import co.utp.misiontic2022.c2.model.vo.Req3;


public class WindowReq extends JFrame {

    private JTable table;
    private ControllerQuery controller;
        
    public WindowReq(){

        initUI();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        controller = new ControllerQuery();
    }

    public void initUI(){
        setTitle("APP challenge 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        var tbd = new JTabbedPane();
        getContentPane().add(tbd, BorderLayout.CENTER);

        var panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tbd.addTab("QUERYS DataBase", panel);
        
        var enterPanel = new JPanel();
        enterPanel.add(new JLabel("QUERY OPTIONS :      "));

        var buttonQuery_1 = new JButton("Query Requirement 1");
        buttonQuery_1.addActionListener(e -> loadTableQuery1());
        enterPanel.add(buttonQuery_1);

        enterPanel.add(new JLabel("       "));

        var buttonQuery_2 = new JButton("Query Requirement 2");
        buttonQuery_2.addActionListener(e -> loadTableQuery2());
        enterPanel.add(buttonQuery_2);

        enterPanel.add(new JLabel("       "));

        var buttonQuery_3 = new JButton("Query Requirement 3");
        buttonQuery_3.addActionListener(e -> loadTableQuery3());
        enterPanel.add(buttonQuery_3);

        var panelDown = new JPanel();
        panelDown.add(new JLabel("MADE BY : MIGUEL FERNANDO GONZALEZ ARANA   /   MISION TIC 2022   /   GROUP 28.      "));

        var buttonExit = new JButton("Exit");
        buttonExit.addActionListener(e -> System.exit(0));
        panelDown.add(buttonExit);

        panel.add(enterPanel, BorderLayout.PAGE_START);
        panel.add(panelDown, BorderLayout.PAGE_END);

        table = new JTable();
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

    }

    
    private void loadTableQuery1() {
        try {
            var list = controller.queryReq1();
            var tableModel = new Query1TableModel();

            tableModel.setData(list);
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Query1TableModel extends AbstractTableModel{
        private ArrayList<Req1> data;

        public void setData(ArrayList<Req1>data){
            this.data = data;
        }

        @Override
        public String getColumnName(int column){
            switch (column) {
                case 0:
                    return "Total";
                case 1:
                    return "ID_proyecto";
                case 2:
                    return "Pagado";
                case 3:
                    return "Proveedor";
            
            }
            return super.getColumnName(column);
        }
        @Override
        public int getRowCount() {
            return data.size();
        }
        @Override
        public int getColumnCount() {
            return 4;
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var register = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return register.getTotal();
                case 1:
                    return register.getIdProyecto();
                case 2:
                    return register.getPagado();
                case 3:
                    return register.getProveedor();
            
            }
            return null;
        }

    }

    private void loadTableQuery2() {
        try {
            var list = controller.queryReq2();
            var tableModel = new Query2TableModel();

            tableModel.setData(list);
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Query2TableModel extends AbstractTableModel{
        private ArrayList<Req2> data;

        public void setData(ArrayList<Req2>data){
            this.data = data;
        }

        @Override
        public String getColumnName(int column){
            switch (column) {
                case 0:
                    return "Inicio";
                case 1:
                    return "Financiable";
                case 2:
                    return "Estrato";
                case 3:
                    return "Porcentaje";
            
            }
            return super.getColumnName(column);
        }
        @Override
        public int getRowCount() {
            return data.size();
        }
        @Override
        public int getColumnCount() {
            return 4;
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var register = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return register.getFechaInicio();
                case 1:
                    return register.getFinanciable();
                case 2:
                    return register.getEstrato();
                case 3:
                    return register.getPorcentaje();
            
            }
            return null;
        }
    }
    private void loadTableQuery3() {
        try {
            var list = controller.queryReq3();
            var tableModel = new Query3TableModel();

            tableModel.setData(list);
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Query3TableModel extends AbstractTableModel{
        private ArrayList<Req3> data;

        public void setData(ArrayList<Req3>data){
            this.data = data;
        }

        @Override
        public String getColumnName(int column){
            switch (column) {
                case 0:
                    return "ID_Proyecto";
                case 1:
                    return "Pagado";
                case 2:
                    return "Clasificacion";
                            
            }
            return super.getColumnName(column);
        }
        @Override
        public int getRowCount() {
            return data.size();
        }
        @Override
        public int getColumnCount() {
            return 3;
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var register = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return register.getIdProyecto();
                case 1:
                    return register.getPagado();
                case 2:
                    return register.getClasificacion();
                            
            }
            return null;
            
        }

        
    
    } 
    
}
