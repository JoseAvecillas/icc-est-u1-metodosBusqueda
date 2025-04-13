public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();

        int[] arreglo = {5, 3, 7, 1, 4};
        int valorBuscado = 7;

        int resultado = app.metodosBusqueda.busquedaLineal(arreglo, valorBuscado);

        if (resultado != -1) {
            System.out.println("Valor encontrado en: " + resultado);
        } else {
            System.out.println("Valor no encontrado en el arreglo.");
        }
    }
}
