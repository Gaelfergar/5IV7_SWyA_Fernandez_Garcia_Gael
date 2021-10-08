import java.io.*;
import java.util.*;

public class CifradoAES {
    
    public static void main(String[] args) throws Exception{
        
        String mensaje = "Tres habitaciones en un buen vecindario";
        String mensajecifrado = AES.encrypt(mensaje);
        String mensajedescifrado = AES.decrypt(mensajecifrado);
        
        System.out.println("El mensaje en texto plano es: "+ mensaje);
        System.out.println("El mensaje cifrado con AES es: "+ mensajecifrado);
        System.out.println("El mensaje descifrado con AES es: "+ mensajedescifrado);    
    }
}
