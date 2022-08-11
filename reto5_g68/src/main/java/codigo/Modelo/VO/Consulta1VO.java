package codigo.Modelo.VO;
import codigo.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta1VO {
    public static ArrayList<String[]> valores() {
        ResultSet rs=null;
        ArrayList<String[]> salida= new ArrayList<String[]>();
        try {
            rs=Consulta1DAO.consulta();
            while(rs.next()){
                //ID_Lider,Nombre, Primer_Apellido,Ciudad_Residencia
                int ID=rs.getInt("ID_Lider");
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Primer_Apellido");
                String ciudad=rs.getString("Ciudad_Residencia");
                salida.add(new String[]{ID+"",nombre,apellido,ciudad});
                //System.out.println(String.format("%5d %-15s %-15s %-15s", ID,nombre,apellido,ciudad));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }     
        return salida;   
    }    
}
