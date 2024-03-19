import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        // Crear un BinarySearchTree para almacenar las traducciones
        BinarySearchTree<String, String> arbolTraduccion = new BinarySearchTree<>();
        
        // Insertar las traducciones en el BinarySearchTree
        arbolTraduccion.insert("woman", "mujer");
        arbolTraduccion.insert("asked", "preguntó");

        // Crear el traductor utilizando el BinarySearchTree
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

