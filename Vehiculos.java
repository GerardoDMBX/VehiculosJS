import java.util.Scanner;

public class Vehiculos{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la marca del vehículo
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();

        // Solicitar al usuario que ingrese el modelo del vehículo
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();

        // Solicitar al usuario que ingrese la cilindrada del vehículo
        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = scanner.nextLine();

        // Solicitar al usuario que ingrese el tipo de combustible del vehículo
        System.out.print("Ingrese el tipo de combustible del vehículo: ");
        String tipoCombustible = scanner.nextLine();

        // Solicitar al usuario que ingrese la capacidad en pasajeros
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidadPasajeros = scanner.nextInt();

        // Mostrar los datos ingresados por el usuario
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
    }
}
