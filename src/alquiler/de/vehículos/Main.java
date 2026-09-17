package alquiler.de.vehículos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(
            new Auto("Toyota", "Corolla", 50)
        );

        vehiculos.add(
            new Moto("Yamaha", "MT-03", 30)
        );

        int dias = 5;

        for (Vehiculo vehiculo : vehiculos) {

            double costo = vehiculo.calcularCostoAlquiler(dias);

            System.out.println("--------------------------------");
            System.out.println("Tipo de vehículo: "
                    + vehiculo.getClass().getSimpleName());

            System.out.println("Marca: "
                    + vehiculo.getMarca());

            System.out.println("Modelo: "
                    + vehiculo.getModelo());

            System.out.println("Tarifa base por día: $"
                    + vehiculo.getTarifaBase());

            System.out.println("Días de alquiler: "
                    + dias);

            System.out.println("Costo total: $"
                    + costo);
        }

        System.out.println("--------------------------------");
    }
}