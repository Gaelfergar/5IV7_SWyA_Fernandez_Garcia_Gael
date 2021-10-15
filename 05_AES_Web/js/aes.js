let password = "";

$(document).ready(function(){
    $('#ci').click(function(){
        //el mensaje
        let mensaje = document.getElementById("demo00").value;
        password = document.getElementById('llave').value;
        var cifrado = CryptoJS.AES.encrypt(mensaje, password);
        //el cifrado
        document.getElementById("demo01").value = cifrado;
        var descifrado = CryptoJS.AES.decrypt(cifrado, password);
        //el descifrado sin formato
        document.getElementById("demo02").value = descifrado;
        //el descifrado con formato
        document.getElementById("demo03").innerHTML = descifrado.toString(CryptoJS.enc.Utf8);
    });
    $('#de').click(function(){
        
        
    });
});
