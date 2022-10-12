import javax.swing.*;
import java.util.Scanner;

public class nueva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, Ingrese su nombre :");
        String Nombre = entrada.next();
        System.out.println("Genial" + Nombre + " un gusto saludarte ");
        System.out.println("Porfavor elegi el tipo de operación a realizar");

        int selecc=0;
        int Numero1=0;
        int Numero2= 0;
        int Resultado= 0;

        do {
            System.out.println("\n");
            System.out.println("Seleccione un numero de operación a realizar");
            System.out.println("1_ sumar / 2_ restar / 3_multiplicar / 4_dividir/ 5_salir");
            selecc= entrada.nextInt();

            if (selecc!=5) {
                System.out.print("Inserte primer numero ");
                Numero1= entrada.nextInt();
                System.out.print("Inserte segundo numero");
                Numero2= entrada.nextInt();
            }
            switch (selecc) {
                case 1:
                    selecc = 1;
                    Resultado = Numero1 + Numero2;
                    System.out.println("El resultado de la suma es: " + Resultado);
                    break;
                case 2:
                    selecc = 2;
                    Resultado = Numero1 - Numero2;
                    System.out.println("El resultado de la resta es :" + Resultado);
                case 3:
                    selecc=3;
                    Resultado=Numero1*Numero2;
                    System.out.println("El resultado de la multiplicación es:" +Resultado);
                case 4:
                    selecc=4;
                    Resultado=Numero1/Numero2;
                    System.out.println("El resultado de la división es" +Resultado);
                default:
                    System.out.println("Opción incorrecta ");
            }
        }while (selecc!=5);
        System.out.println("A eleigo salir de la calculadora hasta la proxima" +Nombre);
    }
}