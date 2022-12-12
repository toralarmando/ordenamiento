package e1_lista;
import java.util.*;

public class E1_Lista {

    public static void main(String[] args) {
      //EJERCICO 1, REALIZAR UNA LISTA EN JAVA
      //Existen varios tipos de formas para realizar una lista, en este caso usaremos estas 3:
      
        //ArrayList (LISTA DE ARREGLO)- El mas conocido por la gran mayoria, al igual que el Vector
        List MiListaArray = new ArrayList(); 
        MiListaArray.add(1); // Se ponen solo en numero por ser de tipo entero
        MiListaArray.add(2);
        MiListaArray.add("Tres"); // Se pone entre parentesis por ser caracteres de tipo cadena
        System.out.println("Lista de Arreglo (Array): " + MiListaArray);  // Impresion del array
  
        //LinkedList - (LISTA VINCULADA)
        List MiListaLinked = new LinkedList(); 
        MiListaLinked.add(4); 
        MiListaLinked.add(5);
        MiListaLinked.add("Seis");
        System.out.println("Lsta Vinculada (Linked): " + MiListaLinked); // Impresion del linked
  
        //Stack (Pila) 
        List MiPila = new Stack(); 
        MiPila.add(7); 
        MiPila.add(8);
        MiPila.add("Nueve");
        System.out.println("Pila (Stack): " + MiPila); // Impresion de la pila
    } 
}