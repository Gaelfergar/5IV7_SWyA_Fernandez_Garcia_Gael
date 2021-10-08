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
import java.security.spec.InvalidKeySpecException;

import java.io.*;

public class Tarea_DES {
    
    public void Cifrar(String Key,String mess)  throws Exception {

        //El usuario puede escribir la llave con lo siguiente:
        //Crear instancia
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        
        //Tomar los bits de la llave del usuario
        DESKeySpec kspec = new DESKeySpec(Key.getBytes());
        
        //Generar las subclaves según la clave del usuario
        SecretKey subkey = skf.generateSecret(kspec);
           
        //ALGORITMO
        /*
        Hay que especificar:
        1. el tipo de algoritmo que usaremos
        2. el modo de cifrado de dicho algoritmo
        3. si existe alguna norma para dicho algoritmo, con los PKCS (estándares para los cifrados)
        */
        Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");
        
        //inicializar con llave
        cifrado.init(Cipher.ENCRYPT_MODE, subkey);
        
        //¿Cómo vamos a leer los bloques?
        //El buffer le da lectura a cada uno de los bloques
        //Buffer para la entrada y salida de los bits
        byte[] buffer = new byte[1000]; //se lee cada mil bytes (8 mil bits)
        byte[] bufferCifrado; 
        
        //generar archivos
        FileInputStream in = new FileInputStream(mess); 
        FileOutputStream out = new FileOutputStream(mess+".cifrado");
        
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
}
 public void Descifrar(String Key,String mess) throws Exception{
 
        //El usuario puede escribir la llave con lo siguiente:
        //Crear instancia
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        
        //Tomar los bits de la llave del usuario
        DESKeySpec kspec = new DESKeySpec(Key.getBytes());
        
        //Generar las subclaves según la clave del usuario
        SecretKey subkey = skf.generateSecret(kspec);
        
        Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");
       
        cifrado.init(Cipher.DECRYPT_MODE, subkey);
        
        //usamos otro buffer
        byte[] bufferPlano;
        byte[] buffer = new byte[1000];
         
        //generar archivos
        FileInputStream in  = new FileInputStream(mess);
        FileOutputStream out = new FileOutputStream(mess+".descifrado");
        
        //lectura       //inicia de cero hasta el tamaño (1000)
        int bytesleidos = in.read(buffer, 0, 1000);
        
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
        
        //ya puedo escribir el archivo descifrado
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