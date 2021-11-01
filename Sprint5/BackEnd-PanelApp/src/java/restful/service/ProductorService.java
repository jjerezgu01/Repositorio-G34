
package restful.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import restful.Model.ProductorModel;
import restful.Model.Conexion;

public class ProductorService {
   
    public ArrayList<ProductorModel> getProductores() {
        ArrayList<ProductorModel> lista = new ArrayList<>();
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM productor";

        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                ProductorModel productor = new ProductorModel();
                productor.setNombre_prod(rs.getString("Nombre_prod"));
                productor.setCod_dept(rs.getString("Cod_dept"));
                productor.setDireccion_prod(rs.getString("Direccion_prod"));
                productor.setCelular_prod(rs.getString("Celular_prod"));
                //productor.setCod_tipo_doc(rs.getString("Cod_tipo_doc"));
                productor.setNumdoc_prod(rs.getString("Numdoc_prod"));
                //productor.setCorreo_prod(rs.getString("Correo_prod"));
                //productor.setClave_prod(rs.getString("Clave_prod"));
                //productor.setAutoriza_datos(rs.getString("Autoriza_datos"));
                //productor.setFecha_registro_prod(rs.getString("Fecha_registro_prod"));
                lista.add(productor);
            }
        } catch (SQLException e) {
        }

        return lista;
    }

    public ProductorModel getProductor(String numdoc_prod) {
        ProductorModel productor = new ProductorModel();
        Conexion conex = new Conexion();
        String Sql = "SELECT * FROM productor WHERE numdoc_prod = ?";
 
        try {

            PreparedStatement pstm = conex.getCon().prepareStatement(Sql);
            pstm.setString(1, numdoc_prod);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                productor.setNumdoc_prod(rs.getString("numdoc_prod"));
                productor.setNombre_prod(rs.getString("nombre_prod"));
                productor.setCod_dept(rs.getString("cod_dept"));
                productor.setDireccion_prod(rs.getString("direccion_prod"));
                productor.setCelular_prod(rs.getString("celular_prod"));
                //productor.setCod_tipo_doc(rs.getString("cod_tipo_doc"));
                //productor.setCorreo_prod(rs.getString("correo_prod"));
                //productor.setClave_prod(rs.getString("clave_prod"));
                //productor.setAutoriza_datos(rs.getString("autoriza_datos"));
                //productor.setFecha_registro_prod(rs.getString("fecha_registro_prod"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return productor;
    }

    //Insertar un nuevo Productor
    public ProductorModel addProductor(ProductorModel productor) {
        Conexion conex = new Conexion();
        String Sql = "INSERT INTO productor(numdoc_prod,nombre_prod,direccion_prod,celular_prod,cod_dept)";
        Sql = Sql + "values (?,?,?,?,?)";

        try {
            PreparedStatement pstm = conex.getCon().prepareStatement(Sql);
            pstm.setString(1, productor.getNumdoc_prod());
            pstm.setString(2, productor.getNombre_prod());
            pstm.setString(3, productor.getDireccion_prod());
            pstm.setString(4, productor.getCelular_prod());
            pstm.setString(5, productor.getCod_dept());
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return productor;
    }

    //Borrar un productor de la base de datos
    public String delProductor(String numdoc_prod) {
        Conexion conn = new Conexion();

        String sql = "DELETE FROM productor WHERE numdoc_prod= ?";
        try {
            PreparedStatement pstm = conn.getCon().prepareStatement(sql);
            pstm.setString(1, numdoc_prod);
            pstm.executeUpdate();
        } catch (SQLException excepcion) {
            System.out.println("Ha ocurrido un error al eliminar  " + excepcion.getMessage());
            return "{\"Accion\":\"Error\"}";
        }
        return "{\"Accion\":\"Registro Borrado\"}";
    }
    
    public ProductorModel updateProductor(ProductorModel productor) {
        Conexion conn = new Conexion();
        String sql = "UPDATE productor SET nombre_prod=?,celular_prod=?,direccion_prod=?,cod_dept=? WHERE numdoc_prod= ?";
        try {
            PreparedStatement pstm = conn.getCon().prepareStatement(sql);
            pstm.setString(1, productor.getNombre_prod());
            pstm.setString(2, productor.getCelular_prod());
            pstm.setString(3, productor.getDireccion_prod());
            pstm.setString(4, productor.getCod_dept());
            pstm.setString(5, productor.getNumdoc_prod());
            pstm.executeUpdate();
        } catch (SQLException excepcion) {
            System.out.println("Ha ocurrido un error al actualizar  " + excepcion.getMessage());
            return null;
        }
        return productor;
    }
}
