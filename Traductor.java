/**
 * Esta clase representa un traductor simple que utiliza un árbol binario de búsqueda
 * para convertir palabras de un idioma a otro.
 */
public class Traductor {

    private BinarySearchTree<String, String> arbolTraduccion;

    /**
     * Constructor de la clase Traductor.
     *
     * @param arbolTraduccion un BinarySearchTree que contiene las traducciones donde las claves son las palabras en el idioma original
     *                        y los valores son las palabras traducidas en el idioma de destino.
     */
    public Traductor(BinarySearchTree<String, String> arbolTraduccion) {
        this.arbolTraduccion = arbolTraduccion;
    }

    /**
     * Traduce una oración del idioma original al idioma de destino utilizando el árbol de traducción proporcionado.
     *
     * @param oracion la oración que se desea traducir.
     * @return la oración traducida, donde las palabras traducidas están rodeadas por asteriscos (*) y las palabras
     *         no traducidas permanecen sin cambios.
     */
    public String traducirOracion(String oracion) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = oracion.split("\\s+"); // Dividir la oración en palabras

        for (String palabra : palabras) {
            String traduccion = arbolTraduccion.search(palabra); // Buscar la traducción en el árbol de traducción
            if (traduccion != null) {
                resultado.append("*").append(traduccion).append("*").append(" "); // Agregar la traducción con asteriscos
            } else {
                resultado.append(palabra).append(" "); // Agregar la palabra original sin asteriscos
            }
        }

        return resultado.toString().trim(); // Eliminar el espacio extra al final y devolver la oración traducida
    }
}
