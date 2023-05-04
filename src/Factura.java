import java.util.Scanner;

public class Factura {
    public void mostarMenu(){
    Scanner sc = new Scanner(System.in);
    int factura = 0;

        do {
        System.out.println("----Que DESEa Facturar -");
        System.out.println("1. Llantas  ");
        System.out.println("2. Kit Pastillas de freno");
        System.out.println("3. Kit de embrague");
        System.out.print("4.   Faro ");
        System.out.print("5.   Radiador  ");

        factura = sc.nextInt();

        switch(factura) {
            case 1:
                System.out.println("Cuantas llantas desea comprar ");

                break;
            case 2:
                System.out.println("Cuantos Kits de pastilas de frenos  desea comprar ");
                break;
            case 3:
                System.out.println("CuantOS Kits de embrage  desea comprar ");
                break;
            case 4:
                System.out.println("CuantOS Faros desea comprar ");
                break;
            case 5:
                System.out.println("CuantOS Radiadores  desea comprar ");
                break;
            case 6:
                System.out.println(" Volviendo al menu principal");
                break;
            default:
                System.out.println("Error escoja la opccion nuevamente ");
                break;
        }

    } while (factura != 3);}


    }

