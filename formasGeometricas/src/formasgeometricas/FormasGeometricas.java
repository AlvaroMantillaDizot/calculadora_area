import java.util.Scanner;

public class FormasGeometricas{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Área Geométrica");
        System.out.println("Selecciona la forma geométrica:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Círculo");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularAreaCuadrado(scanner);
                break;
            case 2:
                calcularAreaCirculo(scanner);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }

    private static void calcularAreaCuadrado(Scanner scanner) {
        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    private static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}
