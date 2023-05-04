import java.util.Scanner;

public class Frenos {
    private int precioNormal=55;
    private int precioAlPorMayor=45;
    int resultado;

    public void descuentoFrenos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("La catidad de Kit de pastillas de frenos ");
        int cantidad = scanner.nextInt();
        System.out.println("Valor por "+cantidad+" Kits de pastillas de frenos ");
        if (cantidad >= 12) {
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
        }

    }


}