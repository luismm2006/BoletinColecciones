package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class NumerosOrdenadosCreciente {

	  private ArrayList<Integer> lista;

	    public NumerosOrdenadosCreciente() {
	        this.lista = new ArrayList<>();
	    }
	    public void agregarNumero(int numero) {
	    	int i = 0;
	    	while (i<lista.size() && numero > lista.get(i)) {
				i++;
			}
	    	lista.add(i, numero);
	    }
	    public void mostrarLista() {
	        for (int num : lista) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	NumerosOrdenadosCreciente NumerosOrdenadosCreciente = new NumerosOrdenadosCreciente();

	    	NumerosOrdenadosCreciente.agregarNumero(5);
	    	NumerosOrdenadosCreciente.agregarNumero(2);
	    	NumerosOrdenadosCreciente.agregarNumero(8);
	    	NumerosOrdenadosCreciente.agregarNumero(1);
	    	NumerosOrdenadosCreciente.agregarNumero(7);
	    	NumerosOrdenadosCreciente.agregarNumero(5); 

	    	NumerosOrdenadosCreciente.mostrarLista();  
	    }
}
