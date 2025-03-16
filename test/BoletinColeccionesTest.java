import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio1.NumerosAleatorios;
import ejercicio2.OrdenarNumeros;
import ejercicio3.NumerosOrdenadosCreciente;
import ejercicio4.NumerosOrdenadosCrecientementeEXT;
import ejercicio5.RecibirYDevolver;
import ejercicio6.ContadorPalabras;
import ejercicio7.UnionIntersectDiferencia;
import ejercicio8.ContenerFunciones;
class BoletinColeccionesTest {
		/*Act 1*/
	    @Test
	    void testGenerarNumerosAleatorios() {
	        int cantidad = 30;
	        int min = 1;
	        int max = 100;
	        NumerosAleatorios generador = new NumerosAleatorios(cantidad, min, max);
	        List<Integer> numeros = generador.generarNumerosAleatorios();
	        
	        assertEquals(cantidad, numeros.size());
	        for (int i = 1; i < numeros.size(); i++) {
	            assertTrue(numeros.get(i - 1) < numeros.get(i));
	            assertTrue(numeros.get(i) >= min && numeros.get(i) <= max);
	        }
	    }
	    /*Act 2*/
	    @Test
	    void testOrdenarAscendente() {
	        List<Integer> numeros = Arrays.asList(45, 12, 78, 34, 89, 23, 67, 90);
	        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);
	        List<Integer> ordenAsc = ordenador.ordenarAscendente();
	        
	        assertEquals(Arrays.asList(12, 23, 34, 45, 67, 78, 89, 90), ordenAsc, "La lista debe estar ordenada de menor a mayor");
	    }
	    
	    @Test
	    void testOrdenarDescendente() {
	        List<Integer> numeros = Arrays.asList(45, 12, 78, 34, 89, 23, 67, 90);
	        OrdenarNumeros ordenador = new OrdenarNumeros(numeros);
	        List<Integer> ordenDesc = ordenador.ordenarDescendente();
	        
	        assertEquals(Arrays.asList(90, 89, 78, 67, 45, 34, 23, 12), ordenDesc, "La lista debe estar ordenada de mayor a menor");
	    }
	    /*Act 3*/
	    @Test
	    void testAgregarNumero() {
	        NumerosOrdenadosCreciente numerosOrdenados = new NumerosOrdenadosCreciente();
	        
	        numerosOrdenados.agregarNumero(5);
	        numerosOrdenados.agregarNumero(2);
	        numerosOrdenados.agregarNumero(8);
	        numerosOrdenados.agregarNumero(1);
	        numerosOrdenados.agregarNumero(7);
	        numerosOrdenados.agregarNumero(5);
	        
	        List<Integer> esperado = Arrays.asList(1, 2, 5, 5, 7, 8);
	        
	        assertEquals(esperado, numerosOrdenados.obtenerLista(), "La lista debe estar ordenada de manera creciente y contener los elementos insertados");
	    }
	    /*Act 4*/
	    @Test
	    void testAgregarElementoEnteros() {
	        NumerosOrdenadosCrecientementeEXT<Integer> numerosOrdenados = new NumerosOrdenadosCrecientementeEXT<>();
	        
	        numerosOrdenados.agregarelemento(5);
	        numerosOrdenados.agregarelemento(2);
	        numerosOrdenados.agregarelemento(8);
	        numerosOrdenados.agregarelemento(1);
	        numerosOrdenados.agregarelemento(7);
	        numerosOrdenados.agregarelemento(5);
	        
	        List<Integer> esperado = Arrays.asList(1, 2, 5, 5, 7, 8);
	        
	        assertEquals(esperado, numerosOrdenados.obtenerLista(), "La lista debe estar ordenada de manera creciente y contener los elementos insertados");
	    }
	    
	    @Test
	    void testAgregarElementoStrings() {
	        NumerosOrdenadosCrecientementeEXT<String> cadenasOrdenadas = new NumerosOrdenadosCrecientementeEXT<>();
	        
	        cadenasOrdenadas.agregarelemento("Banana");
	        cadenasOrdenadas.agregarelemento("Manzana");
	        cadenasOrdenadas.agregarelemento("Cereza");
	        cadenasOrdenadas.agregarelemento("Kiwi");
	        cadenasOrdenadas.agregarelemento("Uva");
	        
	        List<String> esperado = Arrays.asList("Banana", "Cereza", "Kiwi", "Manzana", "Uva");
	        
	        assertEquals(esperado, cadenasOrdenadas.obtenerLista(), "La lista debe estar ordenada de manera creciente y contener los elementos insertados");
	    }
	    /*Act 5*/
	    @Test
	    void testEliminarDuplicadosConEnteros() {
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
	        List<Integer> resultadoEsperado = Arrays.asList(1, 2, 3, 4, 5);
	        assertEquals(resultadoEsperado, RecibirYDevolver.eliminarDuplicados(numeros));
	    }

	    @Test
	    void testEliminarDuplicadosConStrings() {
	        List<String> palabras = Arrays.asList("hola", "mundo", "hola", "java");
	        List<String> resultadoEsperado = Arrays.asList("hola", "mundo", "java");
	        assertEquals(resultadoEsperado, RecibirYDevolver.eliminarDuplicados(palabras));
	    }
	    /*Act 6*/
	    @Test
	    void testObtenerPalabrasRepetidasConFraseNormal() {
	        ContadorPalabras contador = new ContadorPalabras("Hola hola mundo mundo mundo");
	        Set<String> resultadoEsperado = new HashSet<>(Arrays.asList("hola", "mundo"));
	        assertEquals(resultadoEsperado, contador.obtenerPalabrasRepetidas());
	    }

	    @Test
	    void testObtenerPalabrasRepetidasSinRepeticiones() {
	        ContadorPalabras contador = new ContadorPalabras("Java es genial");
	        Set<String> resultadoEsperado = new HashSet<>();
	        assertEquals(resultadoEsperado, contador.obtenerPalabrasRepetidas());
	    }

	    @Test
	    void testObtenerPalabrasRepetidasConPuntuacion() {
	        ContadorPalabras contador = new ContadorPalabras("Hola, hola! Mundo... mundo?");
	        Set<String> resultadoEsperado = new HashSet<>(Arrays.asList("hola", "mundo"));
	        assertEquals(resultadoEsperado, contador.obtenerPalabrasRepetidas());
	    }

	    @Test
	    void testObtenerPalabrasRepetidasConMayusculas() {
	        ContadorPalabras contador = new ContadorPalabras("Sí sí SÍ");
	        Set<String> resultadoEsperado = new HashSet<>(Arrays.asList("sí"));
	        assertEquals(resultadoEsperado, contador.obtenerPalabrasRepetidas());
	    }

	    @Test
	    void testObtenerPalabrasRepetidasConFraseVacia() {
	        ContadorPalabras contador = new ContadorPalabras("");
	        Set<String> resultadoEsperado = new HashSet<>();
	        assertEquals(resultadoEsperado, contador.obtenerPalabrasRepetidas());
	    }
	    /*Act 7*/
	    private UnionIntersectDiferencia<Integer> operacion;
	    private Set<Integer> conjunto1;
	    private Set<Integer> conjunto2;

	    @BeforeEach
	    void setUp() {
	        conjunto1 = new HashSet<>(Arrays.asList(4, 5, 6, 7));
	        conjunto2 = new HashSet<>(Arrays.asList(6, 7, 8, 9));
	        operacion = new UnionIntersectDiferencia<>(conjunto1);
	    }

	    @Test
	    void testUnion() {
	        Set<Integer> esperado = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
	        assertEquals(esperado, operacion.union(conjunto2));
	    }

	    @Test
	    void testInterseccion() {
	        Set<Integer> esperado = new HashSet<>(Arrays.asList(6, 7));
	        assertEquals(esperado, operacion.intersect(conjunto2));
	    }
	    /*Act 8*/
	    private ContenerFunciones funciones;
	    private List<Integer> numeros;

	    @BeforeEach
	    void setUp1() {
	        numeros = Arrays.asList(45, 12, 78, 34, 89, 23, 67, 90);
	        funciones = new ContenerFunciones(numeros);
	    }

	    @Test
	    void testMin() {
	        assertEquals(12, funciones.min());
	    }

	    @Test
	    void testMax() {
	        assertEquals(90, funciones.max());
	    }

	    @Test
	    void testMediaAritmetica() {
	        assertEquals(54.75, funciones.mediaAritmetica(), 0.01);
	    }

	    @Test
	    void testMediana() {
	        assertEquals(50, funciones.mediana());
	    }

	    @Test
	    void testRango() {
	        assertEquals(78, funciones.rango());
	    }

	    @Test
	    void testVarianzaMuestral() {
	        assertEquals(883.93, funciones.calcularVarianzaMuestral(), 0.01);
	    }
	}


