public class MetodosBusqueda {

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // Devuelve el índice donde se encontró el valor
            }
        }
        return -1; // Devuelve -1 si no se encuentra el valor
    }
}