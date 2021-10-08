/*
DES
Cifrado simétrico
Modo de bloque 64 bits
LLave privada de 64 bits, es decir, 8 caracteres
Solo se toman 54 bits para la llave (8x7)
*/

import javax.crypto.*;

//genera llaves
import javax.crypto.spec.*;

//algoritmos de cifrado
import java.security.*;

import java.io.*;

public class Ejemplo_DES {
    
    public static void main(String[]args) throws Exception{
        //comprobar argumento del fichero
        if(args.length != 1){
            mensajeAyuda();
            System.exit(1);
        }
    
    
    //Cargar instancia del proveedor del cifrado que usaremos
    //en este caso es DES
    System.out.println("1.- Generar clave DES: ");
    
    //clase para generar llaves
    KeyGenerator generadorDES = KeyGenerator.getInstance("DES");
    
    //inicializr el tamaño de la llave del generador
    generadorDES.init(56); //Aquí es 56 bits
    
    //generar la clave
    SecretKey clave = generadorDES.generateKey(); //genera las 16 subllaves
    
    System.out.println("La clave es: "+ clave);
    
    //codificación de la llave
    mostrarBytes(clave.getEncoded());
    
    /*
    OJO: la llave NO tiene formato,
    solo son los bits en bruto.
    Ceros y unos permutados
    */
    mostrarBytes(clave.getEncoded());
    
    System.out.println("");
    
    //ALGORITMO
    /*
    Hay que especificar:
    1. el tipo de algoritmo que usaremos
    2. el modo de cifrado de dicho algoritmo
    3. si existe alguna norma para dicho algoritmo, con los PKCS (estándares para los cifrados)
    */
    Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");
    
    /*
    Se usará una instancia del algoritmo DES
    en el modo de cifrado por bloques electrónico (ECB)
    aplicando PKCS5 utilizando padding (relleno)
    para los bloques incompletos (64 y 64 bits)
    */
    
    System.out.println("2.- Cifrar con DES el archivo: "+ args[0]
            +", dejar el resultado en: "+ args[0]+".cifrado");
    
    /*Inicializar con un certificado (niño grande)
    ,con tokens, o el más simple, con llave*/
    cifrado.init(Cipher.ENCRYPT_MODE, clave);
    
    //¿Cómo vamos a leer los bloques?
    //El buffer le da lectura a cada uno de los bloques
    //Buffer para la entrada y salida de los bits
    
    byte[] buffer = new byte[1000]; //se lee cada mil bytes (8 mil bits)
    byte[] bufferCifrado;
    
    //generar archivos
    FileInputStream in = new FileInputStream(args[0]);
    FileOutputStream out = new FileOutputStream(args[0]+".cifrado");
    
    //lectura       //inicia de cero hasta el tamaño (1000)
    int bytesleidos = in.read(buffer, 0, 1000);
    
    //mientras no este al final del fichero o del archivo
      //-1 es afuera, el final. Ya no hay nada que leer
    while(bytesleidos != -1){
        //pasar el texto claro que le dio al cifrador
        bufferCifrado = cifrado.update(buffer, 0, bytesleidos);
        //generar salida
        out.write(bufferCifrado);
        bytesleidos = in.read(buffer, 0, 1000);
    }
    
    //hay que reunir los bloques del cifrado
    bufferCifrado = cifrado.doFinal();
    
    //ya puedo escribir el archivo cifrado
    out.write(bufferCifrado);
    
    //cerramos los flujos por seguridad
    in.close();
    out.close();
    
    
    //DESCIFRAMOOOOOS
    //que es casi lo mismo, porque es simétrico
    System.out.println("3.- Descifrar con DES el archivo: "+ args[0]
            +".cifrado"+ "vamos a ver el resultado en el archivo: "
            +args[0]+".cifrado");
    
    cifrado.init(Cipher.DECRYPT_MODE, clave);
    
    //usamos otro buffer
    byte[] bufferPlano;
    
    //generar archivos
    in = new FileInputStream(args[0]+".cifrado");
    out = new FileOutputStream(args[0]+".descifrado");
    
    //lectura       //inicia de cero hasta el tamaño (1000)
    bytesleidos = in.read(buffer, 0, 1000);
    
    //mientras no este al final del fichero o del archivo
      //-1 es afuera, el final. Ya no hay nada que leer
    while(bytesleidos != -1){
        //pasar el texto claro que le dio al cifrador
        bufferPlano = cifrado.update(buffer, 0, bytesleidos);
        //generar salida
        out.write(bufferPlano);
        bytesleidos = in.read(buffer, 0, 1000);
    }
    
    //hay que reunir los bloques del cifrado
    bufferPlano = cifrado.doFinal();
    
    //ya puedo escribir el archivo cifrado
    out.write(bufferPlano);
    
    //cerramos los flujos por seguridad
    in.close();
    out.close();
    
}

private static void mensajeAyuda(){
    System.out.println("Ejemplo de cifrado DES para archivos .txt");
    System.out.println("La llave solo debe ser de 8 caracteres");
    System.out.println("Compruebe que si cargó el fichero o archivo para cifrar"); 
}

public static void mostrarBytes(byte[] buffer){
                            //aquí trae el tamaño
    System.out.write(buffer, 0, buffer.length);
}
}