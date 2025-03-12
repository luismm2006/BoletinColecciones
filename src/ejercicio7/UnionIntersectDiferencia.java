package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectDiferencia<T> {

	private Set<T> coleccion;

	public UnionIntersectDiferencia(Set<T> coleccion) {
		super();
		this.coleccion = coleccion;
	}
	
	public Set<T> union(Set<T> otraColeccion){
		Set<T> resultado = new HashSet<>(coleccion);
		resultado.addAll(otraColeccion);
		return resultado;
	}
	
	public Set<T> intersect(Set<T> otraColeccion){
		Set<T> resultado = new HashSet<>(coleccion);
		resultado.retainAll(otraColeccion);
		return resultado;
	}
	
	public static void main(String[] args) {
		Set<Integer> colecion1 = new HashSet<Integer>();
		colecion1.add(4);
		colecion1.add(5);
		colecion1.add(6);
		colecion1.add(7);
		Set<Integer> colecion2 = new HashSet<Integer>();
		colecion2.add(6);
		colecion2.add(7);
		colecion2.add(8);
		colecion2.add(9);
		
		UnionIntersectDiferencia<Integer> operacionColeccion1 = new UnionIntersectDiferencia<Integer>(colecion1);
		UnionIntersectDiferencia<Integer> operacionColeccion2 = new UnionIntersectDiferencia<Integer>(colecion2);

		System.out.println("El union será: " + operacionColeccion1.union(colecion2));
		System.out.println("El intersect será: " + operacionColeccion2.intersect(colecion1));
	}

}
