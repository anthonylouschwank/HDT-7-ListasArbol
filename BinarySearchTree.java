/**
 * Estructua de Arbol Binario que puede insertar y buscar nuevos datos
 * 
 * @param <K> el tipo de las claves almacenadas en el árbol (debe ser comparable).
 * @param <V> el tipo de los valores asociados a las claves.
 */
public class BinarySearchTree<K extends Comparable<K>, V> {
    Node<K, V> root;

    /**
     * Inserta un nuevo nodo con la clave y el valor especificados en el árbol.
     *
     * @param key la clave del nuevo nodo.
     * @param value el valor asociado a la clave del nuevo nodo.
     */
    public void insert(K key, V value) {
        root = insertRecursive(root, key, value);
    }

    private Node<K, V> insertRecursive(Node<K, V> current, K key, V value) {
        if (current == null) {
            return new Node<>(key, value);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = insertRecursive(current.left, key, value);
        } else if (key.compareTo(current.key) > 0) {
            current.right = insertRecursive(current.right, key, value);
        } else {
            current.value = value; 
        }

        return current;
    }

    /**
     * Busca el valor asociado a una clave en el árbol.
     *
     * @param key la clave que se desea buscar.
     * @return el valor asociado a la clave, o null si la clave no se encuentra en el árbol.
     */
    public V search(K key) {
        return searchRecursive(root, key);
    }

    private V searchRecursive(Node<K, V> current, K key) {
        if (current == null) {
            return null; 
        }

        if (key.compareTo(current.key) < 0) {
            return searchRecursive(current.left, key); 
        } else if (key.compareTo(current.key) > 0) {
            return searchRecursive(current.right, key); 
        } else {
            return current.value; 
        }
    }
}