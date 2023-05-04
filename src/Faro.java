import java.util.Scanner;

public class Faro {
    private int precioNormal=70;
    private int precioAlPorMayor=60;
    int resultado;

    public void descuentoFaro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("La catidad de Faro ");
        int cantidad = scanner.nextInt();
        System.out.println("Valor por "+cantidad+" Faro ");
        if (cantidad >= 10) {
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
