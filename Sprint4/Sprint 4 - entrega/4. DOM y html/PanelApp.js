/* Funciones de JavaScript para usar en los formularios de PanelApp */

function registrar()
 {
	//Variables a utilizar en la validación de los datos ingresados en el formualario
	var nombre_prod="", identificacion_prod="",fecha_prod="", cantidad_prod=0, unidad_prod="", presentacion_panela="", municipio_prod="",depto_prod="";
	var permitir_contacto="";	

	//Leer los datos ingresados por el usuario
	nombre_prod = "Antonio Rosas";
	identificacion_prod = "12345678";
	fecha_prod = document.getElementById("fecha-prod").value;
	cantidad_prod = document.getElementById("cantidad-prod").value;
	
	//Para Radio Button se utiliza otra forma de capturar el valor del opción seleccionada.
	unidad_prod = document.querySelector('input[name=unidad_prod]:checked').value;
	
	presentacion_panela = document.getElementById("presentacion_panela").value;
	municipio_prod = document.getElementById("municipio_prod").value;
	depto_prod = document.getElementById("depto_prod").value;
	permitir_contacto = document.querySelector('input[name=permitir_contacto]:checked').value;


	mensaje = "La información ingresada que se guardará en la base de datos es: \n";	
	mensaje += "Nombre del Productor: " + nombre_prod + "\n";
	mensaje += "Identificacion del Productor: " + identificacion_prod + "\n";
	mensaje += "Fecha de la Producción: " + fecha_prod + "\n";
	mensaje += "Cantidad de Producción: " + cantidad_prod + "\n";
	mensaje += "Unidad de Producción: " + unidad_prod + "\n";
	mensaje += "Presentación de la panela: " + presentacion_panela + "\n";
	mensaje += "Municipio de Producción: " + municipio_prod + "\n";
	mensaje += "Departamento de Producción: " + depto_prod + "\n";
	mensaje += "Permitir contacto de los compradores?: " + permitir_contacto + "\n";
	
	//Mostrar los datos
	alert(mensaje);
 }
