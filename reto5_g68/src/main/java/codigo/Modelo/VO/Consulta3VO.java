package codigo.Modelo.VO;
import codigo.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta3VO {
    public static ArrayList<String[]> valores() {
        ResultSet rs=null;
        ArrayList<String[]> salida= new ArrayList<String[]>();
        try {
            rs=Consulta3DAO.consulta();
            while(rs.next()){
                //ID_Compra, Constructora, Banco_Vinculado
                int ID=rs.getInt("ID_Compra");
                String constructora=rs.getString("Constructora");
                String banco=rs.getString("Banco_Vinculado");
                salida.add(new String[]{ID+"",constructora,banco});
                //System.out.println(String.format("%5d %-15s %-15s %-15s", ID,nombre,apellido,ciudad));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }     
        return salida;   
    }    
}
