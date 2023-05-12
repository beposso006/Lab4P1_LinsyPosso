/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_linsyposso;
import java.util.Scanner;
/**
 *
 * @author CARMEN POSSO
 */
public class Lab4P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
    boolean seguir = true;
    while (seguir){
        System.out.println("1. Conjuntos");
        System.out.println("2. Contraseña");
        System.out.println("3. Salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = Leer.nextInt();
        switch (opcion){
            
            case 1:
                System.out.println("Ingrese el conjunto para A: ");
                String A = Leer.next();
                System.out.println("Ingrese el conjunto para B: ");
                String B = Leer.next();
                
                String union = A;
                for (int i = 0; i<B.length(); i++){
                    String elemento = Character.toString(B.charAt(i));
                    if (!union.contains(elemento)){
                        union += elemento;
                    }
                    }
                System.out.println("La union de A y B es: " + union);
                
                String interseccion = "";
                for(int i=0; i<A.length(); i++){
                    String elemento = Character.toString(A.charAt(i));
                    if (B.contains(elemento)){
                       interseccion += elemento; 
                       
                    }   
                }
                String nuevointer = interseccion.replace(",", "");
                System.out.println("La instersccion de A y B es: " + nuevointer);

                break;
                
            case 2:
                String contra="";
                boolean valida = false;
                
                while (!valida){
                System.out.println("Ingrese una contraseña: ");
                contra = Leer.next();
                
                boolean letra = false;
                boolean numero = false;
                boolean longitud = false;
                
                for (int i = 0; i<contra.length(); i++){
                    char c = contra.charAt(i);
                    if (c>='a' && c<='z' ||c>='A' && c<='Z'){
                        letra = true;
                    }
                    else if (c>='0' && c<='9'){
                        numero = true;
                    }
                    if (contra.length()>=8){
                        longitud = true;   
                    }    
                }
                if (letra && numero && longitud){
                    valida = true;
                } else{
                    if (!letra){
                        System.out.println("La contraseña debe tener letras");
                    }
                    if (!numero){
                        System.out.println("La contraseña debe tener al menos un numero");
                    }
                    if (!longitud){
                        System.out.println("La contraseña debe tener al menos 8 caracteres");
                    }
                }
                }
                System.out.println("Ingrese un numero: ");
                int numero = Leer.nextInt();
                String newpass = "";
                int contador = numero;
                for (int i = 0; i<contra.length(); i++){
                    if (i%2==0){
                    newpass += contra.charAt(i);
                    }else{
                        newpass += (char)contador;
                        contador ++;
                    }
                    
                }
                
                        
                
                
                
                break;
                
            
                
        // TODO code application logic here
    
}
        }
    }
    }
    
    