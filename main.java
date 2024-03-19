import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        Map<String, String> arbolTraduccion = new HashMap<>();
        arbolTraduccion.put("woman", "mujer");
        arbolTraduccion.put("asked", "preguntó");


        Traductor traductor = new Traductor(arbolTraduccion);

        try (BufferedReader br = new BufferedReader(new FileReader("TEXTO.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaTraducida = traductor.traducirOracion(linea);
                System.out.println(lineaTraducida);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
