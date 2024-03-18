public class main {
    public static void main(String[] args) {
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        tree.insert("Llave1", "unapalabra");
        tree.insert("llave11", "otrapalabra");

        String valor = tree.search("Llave1");
        System.out.println("El valor asociado a la clave 'Llave1' es: " + valor);
    }
}
