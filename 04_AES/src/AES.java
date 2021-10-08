
import java.security.*;

//para generar las subllaves
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

//para dar formato
import sun.misc.*;

public class AES {
    //que no se pueda cambiar
    public static final byte[] keyvalue = new byte[]{
        /*
        LLAVE:
        128 bits = 16 caracteres = 9 rondas
        192 bits = 24 caracteres = 11 rondas
        256 bits = 32 caracteres = 13 rondas
        */
        
        //Esto es la llave privada de 16 caracteres
        'q','w','e','r','t','y','u','i',
        'q','w','e','r','t','y','u','i',
        /*
        //De 24 caracteres
        'q','w','e','r','t','y','u','i'
        */
        /*
        //De 32 caracteres
        'q','w','e','r','t','y','u','i'
        */
    };
    
    //instancia que no puede ser modificada
    private static final String instancia = "AES";
    
    //CIFRADO
    public static String encrypt(String Data) throws Exception{
        //Para cifrar debemos generar las llaves
        //Para generar las llaves hacemos un método
        Key key = generarKey();
        
        //Inicializar el cifrado
        Cipher cifrado = Cipher.getInstance(instancia);
        cifrado.init(Cipher.ENCRYPT_MODE, key);
        
        //Obtener el dato String Data y transformarlo en bytes
        byte[] encValores = cifrado.doFinal(Data.getBytes());
        
        System.out.println("Valores sin formato al cifrar: "+ encValores);
        
        //Dar formato para que el mensaje cifrado pueda ser leído 
        //(todo está en bytes)
        //Formato de codificación base 64
        String valoresencriptados = new BASE64Encoder().encode(encValores);
        return valoresencriptados;
    }
    
    //DESCIFRADO
    public static String decrypt(String valoresencriptados) throws Exception{
        //Para cifrar debemos generar las llaves
        //Para generar las llaves hacemos un método
        Key key = generarKey();
        
        //Inicializar el cifrado
        Cipher cifrado = Cipher.getInstance(instancia);
        cifrado.init(Cipher.DECRYPT_MODE, key);
        
        //Como es inverso, primero debemos saber 
        //el formato para luego interpretarlo
        byte[] decodificadorvalores = new BASE64Decoder().decodeBuffer(valoresencriptados);
        
        //Obtener el dato String Data y transformarlo en bytes
        byte[] decValores = cifrado.doFinal(decodificadorvalores);
        
        System.out.println("Valores sin formato al descifrar: "+ decValores);
        
        String valordescifrados = new String(decValores);
        return valordescifrados;
    }
    
    public static Key generarKey() throws Exception{
        //Ocupar las llaves de AES de la clase SecretKeySpec
        
        //Esto genera las subllaves
        Key key = new SecretKeySpec(keyvalue, instancia);   
        return key;
    }
}
