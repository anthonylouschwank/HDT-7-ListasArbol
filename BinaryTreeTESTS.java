import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinaryTreeTESTS {

    @Test
    public void testSearch() {
        // Crear un árbol binario de búsqueda y agregar algunos valores
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        tree.insert("Llave1", "unapalabra");
        tree.insert("llave11", "otrapalabra");
        tree.insert("llave2", "tercerapalabra");

        // Realizar búsquedas y verificar los resultados
        assertEquals("unapalabra", tree.search("Llave1")); // Se espera encontrar "unapalabra"
        assertEquals("otrapalabra", tree.search("llave11")); // Se espera encontrar "otrapalabra"
        assertEquals("tercerapalabra", tree.search("llave2")); // Se espera encontrar "tercerapalabra"
        assertNull(tree.search("claveInexistente")); // Se espera que no se encuentre la clave y devuelva null
    }
}

