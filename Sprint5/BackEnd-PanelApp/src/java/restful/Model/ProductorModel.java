
package restful.Model;

/* Importar las librerias */
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductorModel {
    /* Atributos del Productor */
    private String nombre_prod;
    private String cod_dept;
    private String direccion_prod;
    private String celular_prod;
    private String cod_tipo_doc;    
    private String numdoc_prod; 
    private String correo_prod; 
    private String clave_prod; 
    private String autoriza_datos; 
    private String fecha_registro_prod; 

    public ProductorModel() {
    }
    
    
    public ProductorModel(String nombre_prod, String cod_dept, String direccion_prod, String celular_prod, 
            String cod_tipo_doc, String numdoc_prod, String correo_prod, String clave_prod,
            String autoriza_datos, String fecha_registro_prod) {
        this.nombre_prod = nombre_prod;
        this.cod_dept = cod_dept;
        this.direccion_prod = direccion_prod;
        this.celular_prod = celular_prod;
        this.cod_tipo_doc = cod_tipo_doc;
        this.numdoc_prod = numdoc_prod;
        this.correo_prod = correo_prod;
        this.clave_prod = clave_prod;
        this.autoriza_datos = autoriza_datos;
        this.fecha_registro_prod = fecha_registro_prod;
    }
    
    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public String getCod_dept() {
        return cod_dept;
    }

    public void setCod_dept(String cod_dept) {
        this.cod_dept = cod_dept;
    }

    public String getDireccion_prod() {
        return direccion_prod;
    }

    public void setDireccion_prod(String direccion_prod) {
        this.direccion_prod = direccion_prod;
    }

    public String getCelular_prod() {
        return celular_prod;
    }

    public void setCelular_prod(String celular_prod) {
        this.celular_prod = celular_prod;
    }

    public String getCod_tipo_doc() {
        return cod_tipo_doc;
    }

    public void setCod_tipo_doc(String cod_tipo_doc) {
        this.cod_tipo_doc = cod_tipo_doc;
    }

    public String getNumdoc_prod() {
        return numdoc_prod;
    }

    public void setNumdoc_prod(String numdoc_prod) {
        this.numdoc_prod = numdoc_prod;
    }

    public String getCorreo_prod() {
        return correo_prod;
    }

    public void setCorreo_prod(String correo_prod) {
        this.correo_prod = correo_prod;
    }

    public String getClave_prod() {
        return clave_prod;
    }

    public void setClave_prod(String clave_prod) {
        this.clave_prod = clave_prod;
    }

    public String getAutoriza_datos() {
        return autoriza_datos;
    }

    public void setAutoriza_datos(String autoriza_datos) {
        this.autoriza_datos = autoriza_datos;
    }

    public String getFecha_registro_prod() {
        return fecha_registro_prod;
    }

    public void setFecha_registro_prod(String fecha_registro_prod) {
        this.fecha_registro_prod = fecha_registro_prod;
    }
}

