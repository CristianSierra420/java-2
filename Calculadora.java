import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");

        Scanner scanner = new Scanner(System.in);

        //  ingrese el valor total de la cuenta
        System.out.print("Ingrese el valor total de la cuenta (incluyendo IVA, en pesos): ");
        double valorCuenta = scanner.nextDouble();

        // ingrese el porcentaje de propina
        System.out.print("Ingrese el porcentaje de propina que desea dejar (por ejemplo, 12 para el 12%): ");
        double porcentajePropina = scanner.nextDouble();
//cerrar scanner
        scanner.close();
// propina a un valor decimal
        double porcentajeDecimal = porcentajePropina / 100.0;

        // valor de la propina
        double valorPropina = valorCuenta * porcentajeDecimal;

        // total a pagar
        double valorTotal = valorCuenta + valorPropina;

        // resultados
        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + String.format("%.0f", porcentajePropina) + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));

    }
}