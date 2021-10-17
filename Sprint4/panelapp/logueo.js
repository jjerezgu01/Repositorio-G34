// Función para validar usuario y contraseña

function validar(){
    var usuario=document.getElementById("user").value, contrasena=document.getElementById("clave").value;
    alert("Usuario: " + usuario  + "\nContraseña: *****");   
    if (usuario==='AvengersGrupo34' & contrasena==='equipo4'){
        alert("Ingreso exitoso " + usuario + ". ¡Le damos la bienvenida!");
        return true;
    }
    else {
        alert("El usuario " + usuario + " no existe o no coincide la contraseña con el usuario ingresado. Intente de nuevo.");
        return false;
    }    

}



// Código que no funcionó

/*Function validacion (validar){
    var val;
    if (usuario==='AvengersGrupo34' & contrasena==='12345'){
        //val=true;
    }
    else {
        val=false;
    }

}

function check(){
    var usuario=document.getElementById("user").value, contrasena=document.getElementById("clave").value;
    if(usuario==='AvengersGrupo34' & contrasena==='equipo4'){
        return true;
        
    else 
        return false;
    }
// Programa principal
var ini=0, usuario=document.getElementById("user"), contrasena=document.getElementById("clave"), ingreso;
while(ini===0){
    validacion(usuario,contrasena);
    if(val===false{
        alert("El usuario" + usuario + "no existe o no coincide la contraseña con el usuario ingresado. Intente de nuevo.");
    }
    else{
        alert("Ingreso exitoso " + usuario + ". ¡Le damos la bienvenida!");
    }    
    
}*/

