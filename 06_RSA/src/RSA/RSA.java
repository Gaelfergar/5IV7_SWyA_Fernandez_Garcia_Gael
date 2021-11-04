package RSA;

import java.math.*;
import java.util.*;

public class RSA {

    //RSA es para cifrar números
    
    //números primos grandes
    int tamprimo;
    BigInteger p, q, n; //n = p*q
    BigInteger fi; //fi = (p-1)*(q-1)
    BigInteger e, d; //"e" es un coprimo/primo relativo de n, donde e: 1 < e < fi(n)
                     //d = e^1 mod(fi)  (Es el inverso multiplicativo de e)
    
    //Constructor de RSA
    public RSA (int tamprimo){
        this.tamprimo = tamprimo;
        generarPrimos();
        generarClaves();
    }
    
    //Obtener p y q, para luego generar las claves. Lo uso para cifrar y descifrar.
    public RSA(BigInteger p, BigInteger q, int tamprimo) {
        this.tamprimo=tamprimo;
        this.p = p;
        this.q = q;
        generarClaves();             
    }
    
    
    //Generar los números primos
    public void generarPrimos(){
        p = new BigInteger(tamprimo, 10, new Random());
        do q = new BigInteger(tamprimo, 10, new Random());
        while(p.compareTo(q)==0);
    }
    
    //generar las claves
    public void generarClaves(){
        //n = p*q
        //fi = (p-1)*(q-1)
        //"e" es un coprimo/primo relativo de n, donde e: 1 < e < fi(n)
        //d = e^1 mod(fi)  (Es el inverso multiplicativo de e)
        n = p.multiply(q);
        fi = p.subtract(BigInteger.valueOf(1));
        fi = fi.multiply(q.subtract(BigInteger.valueOf(1)));
        do e = new BigInteger(2*tamprimo, new Random());
                                          
        while((e.compareTo(fi) != -1) || 
        //gcd es el máximo común divisor
        (e.gcd(fi).compareTo(BigInteger.valueOf(1)) != 0));
    
        d = e.modInverse(fi);
    }
    
    //Cifrar con la clave pública e y n
    public BigInteger[] cifrar(String mensaje){
        
        int i;
                    //1 porque vamos bit por bit
        byte[] temp = new byte[1];
        byte[] digitos = mensaje.getBytes();
        
        BigInteger[] bigdigitos = new BigInteger[digitos.length];
        
        for (i = 0; i < bigdigitos.length; i++){
            temp[0] = digitos[i];
            bigdigitos[i] = new BigInteger(temp);
        }
        
        //cifrado:
        BigInteger[] cifrado = new BigInteger[bigdigitos.length];
        
        for(i = 0; i < bigdigitos.length; i++){
            //fórmula para cifrar:
            //cifrado = mensaje^e mod(n)
            cifrado[i] = bigdigitos[i].modPow(e, n);
        }
        return cifrado;
    }
    
    //Descifrar con la clave privada d y n
    public String descifrar(BigInteger[] cifrado){
        
        //descifrado:
        BigInteger[] descifrado = new BigInteger[cifrado.length];
       
        for(int j = 0; j < descifrado.length; j++){
            //fórmula para descifrar:
            // Mensaje descifrado = cifrado^d mod(n)
            descifrado[j] = cifrado[j].modPow(d, n);
        }
        
        char[] charArray = new char[descifrado.length];
        
        for(int j = 0; j < charArray.length; j++){
            charArray[j] = (char)(descifrado[j].intValue());
        }
        return (new String(charArray));
    }

    public BigInteger getP(){
        return p;
    }
    public BigInteger getQ(){
        return q;
    }
    public BigInteger getN(){
        return n;
    }
    public BigInteger getFi(){
        return fi;
    }
    public BigInteger getE(){
        return e;
    }
    public BigInteger getD(){
        return d;
    }
}