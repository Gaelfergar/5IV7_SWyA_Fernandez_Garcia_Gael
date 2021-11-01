
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.interfaces.*;
/*
La librería de Bouncy Castle sirve para el calculo de los numerotes
p, q y n, para las llaves publicas y privadas para el RSA.
Bouncy Castle no permite tener una llave mayor a 512 por el modo ECB.

import org.bouncycastle.jce.provider.BouncyCastleProvider;
*/

public class RSALibreria {
    
    public static void main(String[] args) throws Exception{
        
        /*
        No tengo maven :( (Netbeans 1.12 con Apache)
        
        Security.addProvider(new BouncyCastleProvider());
        */
        
        System.out.println("1.- Crear las llaves pública y privada");
                                                                //Bouncy Castle
        KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA", "BC");
        
        //Inicializar el tamaño de la llave
        //2048 también se puede
        //4096 tarda un poquito más
        //8192 puede empezar a ser peligroso
        keygen.initialize(1024);
        
        //Generar las llaves pública y privad
        KeyPair clavesRSA = keygen.generateKeyPair();
        
        //Definir la llave pública
        PublicKey clavePublica = clavesRSA.getPublic();
        
        //Definir la llave privada
        PrivateKey clavePrivada = clavesRSA.getPrivate();
                                                            //max 64 por el bloque
        System.out.println("2.- Introducir el texto plano a cifrar (máximo 64 char)");
        
        //Almacenar el texto en un arreglo de bytes
        byte[] bufferplano = leerLinea(System.in);
        
        //CIFRAR:
        Cipher cifrado = Cipher.getInstance("RSA", "BC");
        //se cifra con la clave pública
        cifrado.init(Cipher.ENCRYPT_MODE, clavePublica);
        System.out.println("3.- Ciframos con clave pública");
        byte[] buffercifrado = cifrado.doFinal(bufferplano);
        System.out.println("Texto cifrado: ");
        
        //Esto no tiene formato, es binario
        mostrarBytes(buffercifrado);
        
        System.out.println("");
        
        //DESCIFRAR:
        cifrado.init(Cipher.DECRYPT_MODE, clavePrivada);
        //se descifra con la clave privada
        System.out.println("4.- Desciframos con clave privada");
        byte[] bufferdescifrado = cifrado.doFinal(buffercifrado);
        System.out.println("Texto descifrado: ");
        
        mostrarBytes(bufferdescifrado);
        
        System.out.println("");
        
        
        
        //ahora al revés
        //CIFRAR con la clave privada
        cifrado.init(Cipher.ENCRYPT_MODE, clavePrivada);
        System.out.println("5.- Ciframos con clave privada");
        buffercifrado = cifrado.doFinal(bufferplano);
        System.out.println("Texto cifrado: ");
        //Esto no tiene formato, es binario
        mostrarBytes(buffercifrado);
        System.out.println("");
        
        
        //DESCIFRAR con la clave pública
        cifrado.init(Cipher.DECRYPT_MODE, clavePublica);
        //se descifra con la clave privada
        System.out.println("6.- Desciframos con clave pública");
        bufferdescifrado = cifrado.doFinal(buffercifrado);
        System.out.println("Texto descifrado: ");
        mostrarBytes(bufferdescifrado);
        System.out.println("");
    }
    
    public static byte[] leerLinea(InputStream in) throws IOException{
        byte[] buffer1 = new byte[1000];
        int i=0;
        byte c;
        
        c = (byte)in.read();
        while((c != '\n') && (i < 1000)){
            buffer1[i] = c;
            c = (byte)in.read();
        }
        
        byte[] buffer2 = new byte[i];
        for(int j = 0; j < i; j++){
            buffer2[j] = buffer1[j];
        }
        return buffer2;
    }

    public static void mostrarBytes(byte[] buffer){
        System.out.write(buffer, 0, buffer.length);  
    }
}
