import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        // Crear un objeto Traductor con el árbol de traducción
        // (Asumiendo que ya tenemos el árbol de traducción preparado)
        Map<String, String> arbolTraduccion = new HashMap<>();
        arbolTraduccion.put("woman", "mujer");
        arbolTraduccion.put("asked", "preguntó");
        // Agregar más traducciones según sea necesario...

        Traductor traductor = new Traductor(arbolTraduccion);

        // Leer el archivo de entrada y traducir cada línea
        try (BufferedReader br = new BufferedReader(new FileReader("TEXTO.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Traducir la línea y mostrar el resultado
                String lineaTraducida = traductor.traducirOracion(linea);
                System.out.println(lineaTraducida);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
