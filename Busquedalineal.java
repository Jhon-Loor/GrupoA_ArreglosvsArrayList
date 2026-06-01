import java.util.Scanner;

class Inventario {
    String nombre;
    double precio;

    public Inventario(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Main {
    public static void main(String[] args) {

        // Definimos un arreglo estático con 5 productos
        final int maximo = 5;
        Inventario[] productos = new Inventario[maximo];

        // Asignamos los elementos a cada espacio
        productos[0] = new Inventario("Arroz", 0.50);
        productos[1] = new Inventario("Papas", 0.75);
        productos[2] = new Inventario("Azucar", 1.10);
        productos[3] = new Inventario("Aceite", 1.00);
        productos[4] = new Inventario("Sal", 0.25);

        // Se empieza la búsqueda
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto que desea buscar: ");
        String elemento = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < maximo; i++) {
            if (productos[i].nombre.equalsIgnoreCase(elemento)) {
                System.out.println("Nombre: " + productos[i].nombre);
                System.out.println("Precio: " + productos[i].precio);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nEl producto no se encontró.");
        }

        scanner.close();
    }
}
EJEMPLO Java
mport java.util.Scanner;

class Inventario {
    String nombre;
    double precio;

    public Inventario(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Main {
    public static void main(String[] args) {

        // Definimos un arreglo estático con 5 productos
        final int maximo = 5;
        Inventario[] productos = new Inventario[maximo];

        // Asignamos los elementos a cada espacio
        productos[0] = new Inventario("Arroz", 0.50);
        productos[1] = new Inventario("Papas", 0.75);
        productos[2] = new Inventario("Azucar", 1.10);
        productos[3] = new Inventario("Aceite", 1.00);
        productos[4] = new Inventario("Sal", 0.25);

        // Se empieza la búsqueda
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto que desea buscar: ");
        String elemento = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < maximo; i++) {
            if (productos[i].nombre.equalsIgnoreCase(elemento)) {
                System.out.println("Nombre: " + productos[i].nombre);
                System.out.println("Precio: " + productos[i].precio);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nEl producto no se encontró.");
        }

        scanner.close();
    }
}
