package alquiler.de.vehículos;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {

        double costoCasco = 5;

        return (getTarifaBase() * dias) + costoCasco;
    }
}