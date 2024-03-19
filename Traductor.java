import java.util.*;

public class Traductor {

    private Map<String, String> arbolTraduccion;

    public Traductor(Map<String, String> arbolTraduccion) {
        this.arbolTraduccion = arbolTraduccion;
    }

    public String traducirOracion(String oracion) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = oracion.split("\\s+"); // Dividir la oración en palabras
    
        for (String palabra : palabras) {
            String traduccion = arbolTraduccion.get(palabra); // Buscar la traducción en el árbol de traducción
            if (traduccion != null) {
                resultado.append("*").append(traduccion).append("*").append(" "); // Agregar la traducción con asteriscos
            } else {
                resultado.append(palabra).append(" "); // Agregar la palabra original sin asteriscos
            }
        }
    
        return resultado.toString().trim(); // Eliminar el espacio extra al final y devolver la oración traducida
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Map<String, String> arbolTraduccion = new HashMap<>();
        arbolTraduccion.put("have", "han");
        arbolTraduccion.put("working", "trabajando");

        Traductor traductor = new Traductor(arbolTraduccion);
        String oracionTraducida = traductor.traducirOracion("I have been working all day");
        System.out.println(oracionTraducida); // Imprimirá: "I han been trabajando all day"
    }
}