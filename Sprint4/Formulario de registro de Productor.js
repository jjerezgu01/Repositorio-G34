//Maquetación formulario registro producto
alert("Diligencie esté formulario para realizar su registro como productor")


function registro() {
    var nombre = document.getElementById("nombre").value;
    var region = document.getElementById("region").value;
    var direccion = document.getElementById("direccion").value;
    var celular = document.getElementById("celular").value;
    var email = document.getElementById("email").value;
    var tipoDoc = document.getElementById("tipoDoc").value;
    var archivo = document.getElementById("archivo").value;
    var clave = document.getElementById("clave").value;
    var datos = document.getElementById("datos").value;
    var NumeroDoc = document.getElementById("NumeroDoc").value;

    alert("El usuario " + nombre + "se ha registrado");
}
