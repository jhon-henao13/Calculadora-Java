import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declare variables
        Scanner input = new Scanner(System.in);
        int num1, num2, opcion;

        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();

        // Input the numbers
        while (true) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            try {
                opcion = input.nextInt();
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("------------------------------------");
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                            System.out.println("------------------------------------");
                            break;
                        case 2:
                            System.out.println("------------------------------------");
                            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                            System.out.println("------------------------------------");
                            break;
                        case 3:
                            System.out.println("------------------------------------");
                            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                            System.out.println("------------------------------------");
                            break;
                        case 4:
                            if (num2 == 0) {
                                System.out.println("No se puede dividir por cero.");
                            } else {
                                System.out.println("------------------------------------");
                                System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
                                System.out.println("------------------------------------");
                            }
                            break;
                        case 5:
                            System.out.println("Saliendo del programa...");
                            break;
                    }
                    if (opcion == 5) {
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número entero.");
                input.next(); // Limpiar el buffer de entrada
            }
        }
    }
}
