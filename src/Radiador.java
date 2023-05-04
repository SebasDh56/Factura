import java.util.Scanner;

public class Radiador {
    private int precioNormal=120;
    private int precioAlPorMayor=105;
    int resultado;

    public void descuentoRadiador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("La catidad de Radiador ");
        int cantidad = scanner.nextInt();
        System.out.println("Valor por "+cantidad+" Radiador ");
        if (cantidad >= 8) {
            int resultado = cantidad * precioAlPorMayor;

            System.out.println(" El costo es de " + resultado+ ",00 $");
        } else {
            int resultado = cantidad * precioNormal;
            System.out.println( " El costo es de " + resultado+ ",00 $");
        }
        try {
            Thread.sleep(1000); // Espera 1 segundo (1000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
}
