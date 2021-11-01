//AES
let password = "";

$(document).ready(function(){
    $('#ci').click(function(){
        //el mensaje
        let mensaje = document.getElementById("demo00").value;
        //la llave
        password = document.getElementById('llave').value;
        //el cifrado
        var cifrado = CryptoJS.AES.encrypt(mensaje, password);

        //si no hay nada en el textarea, que no haya nada en el cifrado
        if (document.getElementById('demo00').value == "" || document.getElementById('llave').value == ""){
            document.getElementById('demo01').value == "";
        }else{
            //el cifrado
            document.getElementById("demo01").value = cifrado;
        }
    });
    $('#de').click(function(){
        //el mensaje
        let mensaje = document.getElementById("demo00").value;
        //la llave
        password = document.getElementById('llave').value;
        //el cifrado
        var cifrado = CryptoJS.AES.encrypt(mensaje, password);
        //el descifrado
        var descifrado = CryptoJS.AES.decrypt(cifrado, password);

        //crea una etiqueta "a"
        const a = document.createElement("a");

        /*
        El texto descifrado lo pasa a datos planos
        mediante un flujo de octetos, que es la versión binaria de un archivo de tipo MIME.
        Los archivos de tipo MIME son los que son enviados y recibidos a través de 
        navegadores, servidores y clientes web y
        sirven para reconocer el tipo de archivo que se envía dentro un documento.

        El flujo de octetos puede ser cualquier formato de archivo.
        */
        blob = new Blob([descifrado.toString(CryptoJS.enc.Utf8)], {type: "octet/stream"}),

        //los datos son mandados a un url
        url = window.URL.createObjectURL(blob);

        //asigna el url a el link de la etiqueta "a"
        a.href = url;

        //el url se descarga con este nombre
        a.download = 'mensajeDescifrado.txt';

        //método click
        a.click();

        //se descarga
        window.URL.revokeObjectURL(url);
    });
});



//cambiar tipo de cifrado
function cambiarTipo(dropdown){
    var option = dropdown.options[dropdown.selectedIndex].value,
    llave = document.getElementById('llave');
    llavedos = document.getElementById('llave2');
    if (option == '128') {
        llave.maxLength = 16;
    }
    if (option == '192') {
        llave.maxLength = 24;
    }
    if (option == '256') {
        llave.maxLength = 32;
    }

    if (option == '128') {
        llavedos.maxLength = 16;
    }
    if (option == '192') {
        llavedos.maxLength = 24;
    }
    if (option == '256') {
        llavedos.maxLength = 32;
    }
}

//popup
btnAbrirPopup = document.getElementById('co'),
overlay = document.getElementById('overlay'),
popup = document.getElementById('popup'),
btnCerrarPopup = document.getElementById('btn-cerrar-popup');
btnAbrirPopup.addEventListener('click', function(){
	overlay.classList.add('active');
	popup.classList.add('active');
});
btnCerrarPopup.addEventListener('click', function(e){
	e.preventDefault();
	overlay.classList.remove('active');
	popup.classList.remove('active');
    //borrar inputs
    document.getElementById('demo00').value = "";
    document.getElementById('demo01').value == "";
    $('#el128').attr('selected', false);
    $('#el192').attr('selected', false);
    $('#el256').attr('selected', false);
    document.getElementById('llave').value = "";
});

//popup 2
btnAbrirPopup2 = document.getElementById('ci'),
overlay2 = document.getElementById('overlay2'),
popup2 = document.getElementById('popup2'),
btnCerrarPopup2 = document.getElementById('btn-cerrar-popup2');
btnAbrirPopup2.addEventListener('click', function(){
    overlay.classList.remove('active');
	popup.classList.remove('active');
	overlay2.classList.add('active');
	popup2.classList.add('active');
});
btnCerrarPopup2.addEventListener('click', function(e){
	e.preventDefault();
    overlay.classList.remove('active');
	popup.classList.remove('active');
	overlay2.classList.remove('active');
	popup2.classList.remove('active');
    //borrar inputs
    document.getElementById('demo00').value = "";
    $('#el128').attr('selected', false);
    $('#el192').attr('selected', false);
    $('#el256').attr('selected', false);
    document.getElementById('llave').value = "";
    document.getElementById('llave2').value = "";
});

