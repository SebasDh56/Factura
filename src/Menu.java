import java.util.Scanner;
public class Menu {
    public void opciones() {


        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int producto;
        int volver;

        while (!salir) {

            System.out.println("1. Facturar producto");
            System.out.println("2. Imprimir factura");
            System.out.println("3. Salir");
            System.out.println("Elija su opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    MenuFactura productos = new MenuFactura();
                    productos.productos();

                case 2:
                    Imprimir descuentoTotal=new Imprimir();
                    descuentoTotal.descuentoTotal();
                    break;
                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        }
    }
}
