package ejercicio2;

import java.util.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros {

    private List<Integer> numeros;

    public OrdenarNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdenada = new ArrayList<>(numeros);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaOrdenada = new ArrayList<>(numeros);
        Collections.sort(listaOrdenada, Collections.reverseOrder());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(45, 12, 78, 34, 89, 23, 67, 90);

        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);
        List<Integer> ordenAsc = ordenador.ordenarAscendente();
        List<Integer> ordenDesc = ordenador.ordenarDescendente();

        System.out.println("Números en orden ascendente: " + ordenAsc);
        System.out.println("Números en orden descendente: " + ordenDesc);
    }
}


