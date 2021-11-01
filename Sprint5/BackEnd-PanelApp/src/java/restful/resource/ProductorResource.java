/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restful.resource;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import restful.Model.ProductorModel;
import restful.service.ProductorService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;

/**
 *
 * @author SENA
 */
@Path("productor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class ProductorResource {

    ProductorService servicio = new ProductorService();

    // Este método retorna el listado completo de los Productores en formato JSON
    // El path a usar es http://server/PanelApp/api/productor
    @GET
    public ArrayList<ProductorModel> getProductores() {

        return servicio.getProductores();
    }

    // Este método retorna la información para un Productor particular en formato JSON. 
    // Se debe pasar como parámetro el numero de documento del productor
    // El path a usar es http://server/PanelApp/api/productor/12345678    
    @Path("/{numdoc_prod}")
    @GET
    public ProductorModel getProductor(@PathParam("numdoc_prod") String id) {

        return servicio.getProductor(id);
    }

    // Este método INSERTA la información para un Productor particular en la base de datos. 
    // Se debe pasar como parámetro en formato JSON la información del Productor, así:
    /*
    {
    "celular_prod": "3201234567",
    "cod_dept": "25",
    "direccion_prod": "Cas 45 Bucaramanga",
    "nombre_prod": "Sergio Espinosa",
    "numdoc_prod": "357989"
    }
    */
    // El path a usar es http://server/PanelApp/api/productor/
    // Se puede probar en Postman seleccionando el método POST, BODY y JSON
    @POST
    public ProductorModel addProductor(String JSON) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        ProductorModel productor = gson.fromJson(JSON, ProductorModel.class);
        return servicio.addProductor(productor);
    }

    // Este método BORRA la información para un Productor particular de la base de datos. 
    // Se debe pasar como parámetro el número del documento del Productor.
    // El path a usar es http://server/PanelApp/api/productor/12345678
    // Se puede probar en Postman seleccionando el método DELETE, Send
    @DELETE
    @Path("/{numdoc_prod}")
    public String delProductor(@PathParam("numdoc_prod") String numdoc_prod) {

        return servicio.delProductor(numdoc_prod);

    }

    // Este método ACTUALIZA la información para un Productor particular de la base de datos. 
    // Se debe pasar como parámetro el número del documento del Productor.
    // El path a usar es http://server/PanelApp/api/productor/12345678
    // Se puede probar en Postman seleccionando el método DELETE, Send
    @PUT
    public ProductorModel updateProductor(String JSON) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        ProductorModel productor = gson.fromJson(JSON, ProductorModel.class);
        return servicio.updateProductor(productor);
    }

}
