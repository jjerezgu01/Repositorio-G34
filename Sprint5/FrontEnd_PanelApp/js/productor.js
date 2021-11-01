//const url = "http://localhost:8080/PanelApp/api/productor"
const url = "http://localhost:8080/PanelApp/api/productor"
const contenedor = document.querySelector('tbody')
let resultados = ''
const modalProductor = new bootstrap.Modal(document.getElementById('modalProductor'))
const formProductor = document.querySelector('form')
const nombreProductor = document.getElementById('nombre')
const direccionProductor = document.getElementById('direccion')
const celularProductor = document.getElementById('celular')
const ciudadProductor = document.getElementById('ciudad')
const NumDocumentoProductor = document.getElementById('num_documento')
let opcion = ''
btnCrear.addEventListener('click', () => {
    nombreProductor.value = ''
    direccionProductor.value = ''
    celularProductor.value = ''
    ciudadProductor.value = ''
    NumDocumentoProductor.value = ''
    NumDocumentoProductor.disabled = false
    modalProductor.show()
    opcion = 'crear'
})
const ajax = (options) => {
    let { url, method, success, error, data } = options;
    const xhr = new XMLHttpRequest();
	
	console.log(options);
				
    xhr.addEventListener("readystatechange", (e) => {
        if (xhr.readyState !== 4) return;

        if (xhr.status >= 200 && xhr.status < 300) {
            let json = JSON.parse(xhr.responseText);
            success(json);
        } else {
            let message = xhr.statusText || "Ocurrió un error";
            error(`Error ${xhr.status}: ${message}`);
        }
    });

    xhr.open(method || "GET", url);
    xhr.setRequestHeader("Content-type", "application/json; charset=utf-8");
    xhr.send(JSON.stringify(data));
};
const getAll = () => {
    ajax({
        url: url,
        method: "GET",
        success: (res) => {
            console.log(res);

            res.forEach((productor) => {
                resultados += `<tr>
                        <td width="10%">${productor.numdoc_prod}</td>
                        <td width="15%">${productor.nombre_prod}</td>
                        <td width="25%">${productor.direccion_prod}</td>
                        <td width="15%">${productor.celular_prod}</td>
                        <td width="15%">${productor.cod_dept}</td>
                        <td class="text-center" width="20%"><a class="btnEditar btn btn-primary">Editar</a><a class="btnBorrar btn btn-danger">Borrar</a></td>
                    </tr>`
            });

            contenedor.innerHTML = resultados
        },
        error: (err) => {
            console.log(err);
            $table.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`);
        },
    });
};
document.addEventListener("DOMContentLoaded", getAll);
document.addEventListener("click", (e) => {
	
    if (e.target.matches(".btnBorrar")) {
        const fila = e.target.parentNode.parentNode
        const id = fila.firstElementChild.innerHTML
        console.log(id)
        alertify.confirm(`¿Estás seguro de eliminar el num_documento ${id}?`,
            function () {
                ajax({
                    url: url + "/" + id,
                    method: "DELETE",
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    success: (res) => location.reload(),
                    error: (err) => alert(err),
                });
                alertify.success('Registro eliminado')
            },
            function () {
                alertify.error('Cancel')
            });


    }
    if (e.target.matches(".btnEditar")) {
        const fila = e.target.parentNode.parentNode
        NumDocumentoProductor.value = fila.children[0].innerHTML
        nombreProductor.value = fila.children[1].innerHTML
        direccionProductor.value = fila.children[2].innerHTML
        celularProductor.value = fila.children[3].innerHTML
        ciudadProductor.value = fila.children[4].innerHTML
        NumDocumentoProductor.disabled = true
        opcion = 'editar'
        modalProductor.show()
    }
})

formProductor.addEventListener('submit', (e) => {

	e.preventDefault()
    let metodo = "POST"
    if (opcion == 'editar') {
        metodo = "PUT"
 
    }
    ajax({
        url: url,
        method: metodo,
        headers: {
            'Content-Type': 'application/json'
        },
		success: (res) => location.reload(),
        error: (err) =>
            $form.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`),
        data: {
            "cod_dept": ciudadProductor.value,
            "direccion_prod": direccionProductor.value,
            "numdoc_prod": NumDocumentoProductor.value,
            "nombre_prod": nombreProductor.value,
            "celular_prod": celularProductor.value
        },
    });
    modalProductor.hide()
})
