package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ContenerFunciones {

    private List<Integer> lista;

    public ContenerFunciones(List<Integer> numeros) {
        this.lista = new ArrayList<>(numeros);
    }
    public int min() {
        Collections.sort(lista);  
        return lista.get(0); 
    }
    public static void main(String[] args) {
        List<Integer> numeros = List.of(45, 12, 78, 34, 89, 23, 67, 90);
        ContenerFunciones minimoContenerFunciones = new ContenerFunciones(numeros);
        System.out.println("El número mínimo es: " + minimoContenerFunciones.min());
    }
}

