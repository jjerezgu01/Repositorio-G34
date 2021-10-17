//Maquetación formulario registro producto
alert("Diligencie esté formulario para realizar su registro como productor")


function registro() {
    var nombre = document.getElementById("nombre").value;
    var ciudad = document.getElementById("ciudad").value;
    var direccion = document.getElementById("direccion").value;
    var celular = document.getElementById("celular").value;
    var email = document.getElementById("email").value;
    var tipoDoc = document.getElementById("tipoDoc").value;
    var archivo = document.getElementById("archivo").value;
    var clave = document.getElementById("clave").value;
    var datos = document.getElementById("datos").value;
    var NumeroDoc = document.getElementById("NumeroDoc").value;

    if (nombre) {
        alert("Nombre ingresado");
    } else {
        alert("No ingreso nombre");
    }
    if (ciudad) {
        alert("Ciudad ingresada");
    } else {
        alert("No ingreso ciudad");
    }
    if (direccion) {
        alert("Dirección ingresado");
    } else {
        alert("No ingreso dirección");
    }
    if (celular) {
        alert("Número celular ingresado");
    } else {
        alert("No ingreso número celular");
    }
    if (email) {
        alert("Email ingresado");
    } else {
        alert("No ingreso Email");
    }
    if (clave) {
        alert("Clave ingresada");
    } else {
        alert("No ingreso clave");
    }
    if (NumeroDoc) {
        alert("Número documento identidad ingresado");
    } else {
        alert("No ingreso número documento identidad");
    }
    if (datos) {
        alert("No acepto tratamiento de");
    } else {
        alert("No ingreso nombre");
    }
    alert("El usuario " + nombre + " se ha registrado");
    
}