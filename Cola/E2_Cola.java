package e2_cola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E2_Cola {

    static int n=0,elemento=0;
    
    public static void main(String[] args) throws IOException, Exception {
        
        ColaArray k=new ColaArray();
        BufferedReader b=new BufferedReader
        (new InputStreamReader(System.in));
        
        do{
            System.out.println("---- ELIJA LA OPERACION A REALIZAR ----");
            System.out.println("----------------- MENU -----------------");
            System.out.println("1. Ingresar elementos");
            System.out.println("2. Eliminar elementos");// CONTROLAR Q SI ELIMINA SE PERCATE DE Q NO ESTE VACIA 
            System.out.println("3. Ver si la cola esta vacia");
            System.out.println("4. Ver el frente de la cola");// SI NO HAY ELEMENTOS QUE DESPLIGUE UN MENSAJE Q NO HAY ELEMENTOS
            System.out.println("5. Borrar");
            System.out.println("6. Ver si la cola esta  llena");
            System.out.println("7. SALIR");
            n=Integer.parseInt(b.readLine());
            
            if(n==1){
                if(k.ColaLlena()){
                    System.out.println("COLLA LLENA NO SE PUEDE INGRESAR ELEMENTOS");
                }else
                    System.err.print("// INGRESE LOS ELEMNTOS //= ");
                elemento=Integer.parseInt(b.readLine());
                k.insertarQ(elemento);
            }
            
            if(n==2){
                if(k.ColaVacia()){
                    System.err.println("LA COLAN ESTA VACIA NO PUEDE ELIMINA ELEMENTOS");
                }else
                    System.out.println(k.eliminarQ());
            }
            
            if(n==3){
                if(k.ColaVacia()){
                    System.out.println("LA COLA ESTA VACIA");
                }else
                    System.out.println("LA COLA NO ESTA VACIA ");
            }
            
            if(n==4){
                if(k.ColaVacia()){
                    System.err.println("LA COLAN ESTA VACIA NO hay elemento en el frente");
                }else
                    System.out.println("EL FRENTE DE LA COLA ES= "+k.frenteQ());
            }
            
            if(n==5){
                k.BorrarQ();
            }
            
            if(n==6){
                k.ColaLlena();
                if(k.ColaLlena()){
                    System.out.println("LA COLA ESTA LLENA");
                }else
                    System.out.println("LA COLA NO ESTA LLENA");
            }
            
            if(n==7){
                System.exit(0);
            }
            
        }while(n!=7);
 }  
}

