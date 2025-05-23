import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinaria;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas= new Person[7];
        personas[0] = new Person(101, "Juan");
        personas[1] = new Person(102, "Maria");
        personas[2] = new Person(103, "Carlos");
        personas[3] = new Person(104, "Ana");
        personas[4] = new Person(105, "Luis");
        personas[5] = new Person(106, "Sofia");
        personas[6] = new Person(107, "Pedro");
        System.out.println("La lista ingresada es: ");

        //METODO DE BUSQUEDA
       //MetodosBusqueda mB = new MetodosBusqueda(personas);
       MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
       mBB.showPersonByName();

    }
}

// int resultado = metodosBusqueda.busquedaLineal(arreglo, valorBuscado);
//         metodosBusqueda.imprimirArreglo(arreglo);
//         System.out.println("Valor encontrado en: " + resultado);