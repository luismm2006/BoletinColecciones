package ejercicio6;

import java.util.*;

public class ContadorPalabras {
    private String frase;

    // Constructor
    public ContadorPalabras(String frase) {
        this.frase = frase;
    }

    public Set<String> obtenerPalabrasRepetidas() {
        // pasamos a minúsculas y eliminamos distincion de acento
        String fraseLimpia = frase.toLowerCase().replaceAll("[^a-záéíóúüñ ]", ""); 

        
        String[] palabras = fraseLimpia.split("\\s+|,"); 

        Set<String> palabrasUnicas = new HashSet<>();
        Set<String> palabrasRepetidas = new HashSet<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) { 
                if (!palabrasUnicas.add(palabra)) { 
                    palabrasRepetidas.add(palabra);
                }
            }
        }

        return palabrasRepetidas;
    }


    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras("Pues ná, no sí que me dijo no ni ná , sí.");
        System.out.println("Palabras repetidas: " + contador.obtenerPalabrasRepetidas());
    

    }
}
