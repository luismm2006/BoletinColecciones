import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ejercicio2.OrdenarNumeros;

public class OrdenarNumerostest {

	    @Test
	    public void testOrdenarAscendente() {
	        List<Integer> numeros = List.of(45, 12, 78, 34, 89, 23, 67, 90);
	        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);

	        List<Integer> ordenAsc = ordenador.ordenarAscendente();
	        
	        // Verificamos que la lista esté ordenada de menor a mayor
	        assertEquals(8, ordenAsc.size(), "La lista no tiene el tamaño esperado.");
	        assertEquals(12, ordenAsc.get(0), "El primer número no es el esperado.");
	        assertEquals(90, ordenAsc.get(7), "El último número no es el esperado.");
	        assertTrue(ordenAsc.get(0) <= ordenAsc.get(1), "La lista no está correctamente ordenada.");
	    }

	    @Test
	    public void testOrdenarDescendente() {
	        List<Integer> numeros = List.of(45, 12, 78, 34, 89, 23, 67, 90);
	        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);

	        List<Integer> ordenDesc = ordenador.ordenarDescendente();
	        
	        // Verificamos que la lista esté ordenada de mayor a menor
	        assertEquals(8, ordenDesc.size(), "La lista no tiene el tamaño esperado.");
	        assertEquals(90, ordenDesc.get(0), "El primer número no es el esperado.");
	        assertEquals(12, ordenDesc.get(7), "El último número no es el esperado.");
	        assertTrue(ordenDesc.get(0) >= ordenDesc.get(1), "La lista no está correctamente ordenada.");
	    }

	    @Test
	    public void testListaVacia() {
	        List<Integer> numeros = List.of();
	        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);

	        List<Integer> ordenAsc = ordenador.ordenarAscendente();
	        List<Integer> ordenDesc = ordenador.ordenarDescendente();

	        // Verificamos que la lista esté vacía
	        assertTrue(ordenAsc.isEmpty(), "La lista ascendente no está vacía.");
	        assertTrue(ordenDesc.isEmpty(), "La lista descendente no está vacía.");
	    }

	    @Test
	    public void testListaConUnElemento() {
	        List<Integer> numeros = List.of(5);
	        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);

	        List<Integer> ordenAsc = ordenador.ordenarAscendente();
	        List<Integer> ordenDesc = ordenador.ordenarDescendente();

	        // Verificamos que la lista con un solo elemento no cambie
	        assertEquals(5, ordenAsc.get(0), "El único número de la lista no es el esperado.");
	        assertEquals(5, ordenDesc.get(0), "El único número de la lista no es el esperado.");
	    }
	}


