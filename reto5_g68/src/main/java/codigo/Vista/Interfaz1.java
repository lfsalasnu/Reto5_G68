package codigo.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import codigo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz1 extends JFrame {
    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01;

    public Interfaz1(){
        setTitle("Consulta 1");
        setSize(500,500);
        setResizable(false);
        String[] columnas={"ID","Nombre","Apellido","Ciudad"};
        ArrayList<String[]> d=Consulta1VO.valores();
        String[][] datos=new String[d.size()][4];
        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                datos[i][j]=s;
                j++;
                
            }
            
        }

        //String[][] datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(datos,columnas);
        tabla=new JTable(modelo);
        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,420);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(75,86,239));
        add(panelg);
        
        setVisible(true);
    }


}
