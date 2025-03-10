package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NumerosAleatorios {

    private int cantidad;
    private int min;
    private int max;

    public NumerosAleatorios(int cantidad, int min, int max) {
        this.cantidad = cantidad;
        this.min = min;
        this.max = max;
    }

    public List<Integer> generarNumerosAleatorios() {
        Random random = new Random();
        Set<Integer> numerosUnicos = new HashSet<>();

        while (numerosUnicos.size() < cantidad) {
            int numero = random.nextInt(max - min + 1) + min;
            numerosUnicos.add(numero);
        }

        List<Integer> listaOrdenada = new ArrayList<>(numerosUnicos);
        Collections.sort(listaOrdenada);

        return listaOrdenada;
    }

    public static void main(String[] args) {
        NumerosAleatorios generador = new NumerosAleatorios(30, 1, 100);
        List<Integer> numerosOrdenados = generador.generarNumerosAleatorios();

        System.out.println("Números aleatorios ordenados:");
        System.out.println(numerosOrdenados);
    }
}


