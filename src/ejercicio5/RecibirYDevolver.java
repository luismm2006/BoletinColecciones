package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecibirYDevolver {

	public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        System.out.println(eliminarDuplicados(numeros)); 
        List<String> palabras = new ArrayList<>(Arrays.asList("hola", "mundo", "hola", "java"));
        System.out.println(eliminarDuplicados(palabras));
    }
	public static <T> List<T> eliminarDuplicados(List<T> lista){
		Set<T> grupo = new HashSet<>(lista);
		return new ArrayList<T>(grupo);
	}
}
