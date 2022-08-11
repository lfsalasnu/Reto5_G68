package codigo.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import codigo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;
public class Interfaz2 extends JFrame{
    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01;

    public Interfaz2(){
        setTitle("Consulta 2");
        setSize(500,330);
        setResizable(false);
        String[] columnas={"ID","Constructora","Numero de habitaciones","Ciudad"};
        ArrayList<String[]> d=Consulta2VO.valores();
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
        scpanel01.setBounds(20,20,440,230);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(172,239,75));
        add(panelg);
        
        setVisible(true);
    }
}
