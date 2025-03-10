package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class NumerosOrdenadosCrecientementeEXT<T extends Comparable<T>>{

	  private ArrayList<T> lista;

	    public NumerosOrdenadosCrecientementeEXT() {
	        this.lista = new ArrayList<>();
	    }
	    public void agregarelemento(T elemento) {
	    	int i = 0;
	    	while (i<lista.size() && elemento.compareTo(lista.get(i))>0) {
				i++;
			}
	    	lista.add(i, elemento);
	    }
	    public void mostrarLista() {
	        for (T elem : lista) {
	            System.out.print(elem + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	NumerosOrdenadosCrecientementeEXT<Integer> NumerosOrdenadosCrecientementeEXT = new NumerosOrdenadosCrecientementeEXT<>();

	    	NumerosOrdenadosCrecientementeEXT.agregarelemento(5);
	    	NumerosOrdenadosCrecientementeEXT.agregarelemento(2);
	    	NumerosOrdenadosCrecientementeEXT.agregarelemento(8);
	    	NumerosOrdenadosCrecientementeEXT.agregarelemento(1);
	    	NumerosOrdenadosCrecientementeEXT.agregarelemento(7);
	    	NumerosOrdenadosCrecientementeEXT.agregarelemento(5); 

	    	NumerosOrdenadosCrecientementeEXT.mostrarLista();  
	    	
	    	NumerosOrdenadosCrecientementeEXT<String> CadenasOrdenadasCrecientementeEXT = new NumerosOrdenadosCrecientementeEXT<>();
	    	CadenasOrdenadasCrecientementeEXT.agregarelemento("Banana");
	    	CadenasOrdenadasCrecientementeEXT.agregarelemento("Manzana");
	    	CadenasOrdenadasCrecientementeEXT.agregarelemento("Cereza");
	    	CadenasOrdenadasCrecientementeEXT.agregarelemento("Kiwi");
	    	CadenasOrdenadasCrecientementeEXT.agregarelemento("Uva");
	    	CadenasOrdenadasCrecientementeEXT.mostrarLista();
	    }
}
