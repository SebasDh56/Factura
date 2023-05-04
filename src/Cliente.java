import java.util.Scanner;
public class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public static void cliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cedula del cliente: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese la direccion del cliente: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese el telefono del cliente: ");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, cedula, direccion, telefono);

        System.out.println("\nDatos del cliente:");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Cedula: " + cliente.cedula);
        System.out.println("Direccion: " + cliente.direccion);
        System.out.println("Telefono: " + cliente.telefono);
    }
}
