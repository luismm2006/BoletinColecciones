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
    public int max() {
        Collections.sort(lista);  
        return lista.get(lista.size()-1); 
    }
    public double mediaAritmetica() {
    	int suma = 0;
    	for (int num : lista) {
			suma += num;
		}
    	double media = suma / lista.size();
    	return media;
    }
    public int mediana() {
    	int mediana = 0;
    	if (lista.size()%2==1) {
			mediana = lista.size()/2;
		}else {
			int medida1 = lista.get(lista.size()/2 -1);
			int medida2 = lista.get(lista.size()/2);
			mediana = (medida1 + medida2) / 2;
		}
    	return mediana;
    }
    //Falta E
    
    public int rango() {
    	int max = max();
    	int min = min();
    	
    	return max-min;
    }
    public double calcularMedia() {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return (double) suma / lista.size();
    }
    public double calcularVarianzaMuestral() {
        double media = calcularMedia();
        double sumaCuadrados = 0;

        for (int num : lista) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return sumaCuadrados/(lista.size() - 1);
    }
    public static void main(String[] args) {
        List<Integer> numeros = List.of(45, 12, 78, 34, 89, 23, 67, 90);
        ContenerFunciones ContenerFunciones = new ContenerFunciones(numeros);
        System.out.println("El número mínimo es: " + ContenerFunciones.min());
        System.out.println("El número máximo es: " + ContenerFunciones.max());
        System.out.println("La media aritmética es: " + ContenerFunciones.mediaAritmetica());
        System.out.println("La mediana es: " + ContenerFunciones.mediana());
        
        System.out.println("El rango es: " + ContenerFunciones.rango());
        System.out.println("La varianza muestral es: " + ContenerFunciones.calcularVarianzaMuestral());
    }
}

