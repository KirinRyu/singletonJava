public class App {
    public static void main(String[] args) throws Exception {

        Fila unicaFila = Fila.getInstance();
        unicaFila.imprimeDocumento();
        unicaFila.removeDocumento();
        unicaFila.removeTodosDocumento();

        Fila segundaFila = Fila.getInstance();
        segundaFila.imprimeDocumento();
        segundaFila.removeDocumento();
        segundaFila.removeTodosDocumento();
    }
}
